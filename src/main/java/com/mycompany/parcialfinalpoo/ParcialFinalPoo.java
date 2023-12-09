package com.mycompany.parcialfinalpoo;
import com.google.gson.Gson;
import java.util.LinkedList;
import static spark.Spark.*;
/**
 *
 * @author JORS SOLARTE
 */
public class ParcialFinalPoo {
    
private static LinkedList<Libro> libros = new LinkedList<>();
private static LinkedList<Autor> autores = new LinkedList<>();

private static LinkedList<Copia> copias = new LinkedList<>();
private static LinkedList<Lector> lectores = new LinkedList<>();
private static LinkedList<Prestamo> prestamos = new LinkedList<>();
private static LinkedList<Multa> multas = new LinkedList<>();
       
public static void main(String[] args) {
    
    Gson gson = new Gson();
    
    autores.add(addAutor("Gabriel Garcia Marquez", "Colombiano", "06/03/1927", libros));
    
    libros.add(addLibro("Cien Años De Soledad", "Realismo", "Sudamericana", 1967, autores));
     
    lectores.add(addLector(1, "Santiago", "Solarte", "2323",null));
    
    //Libro2
    autores.add(addAutor("Antoine de Saint", "Frances", "29/06/1900", libros));
    
    libros.add(addLibro("Principito", "Novela Corta", "Reynal", 194, autores));
  
    lectores.add(addLector(2, "Carlos", "Castillo", "2423",null) );
       


get("/agregarAutor/:nombre/:nacionalidad/:fechaNacimiento", (req, res) -> {
        res.type("application/json");

        String nombre = req.params(":nombre");
        String nacionalidad = req.params(":nacionalidad");
        String fechaNacimiento = req.params(":fechaNacimiento");
        Autor nuevoAutor = new Autor(nombre, nacionalidad, fechaNacimiento, libros); 
        autores.add(nuevoAutor);
        return gson.toJson(nuevoAutor);
        }); 
        
get("/agregarLibro/:nombre/:tipo/:editorial/:año/:autores", (req, res) -> {
        res.type("application/json");

        String nombre = req.params(":nombre");
        String tipo = req.params(":tipo");
        String editorial = req.params(":editorial");
        int año = Integer.parseInt(req.params(":año"));
//        String autorString = req.params(":autores");
//        //convertir a objeto Autor
//        Autor autores = gson.fromJson(autorString, Autor.class);
        libros.add(addLibro(nombre, tipo, editorial, año, autores));         
        return gson.toJson(libros);
        });   

get("/agregarCopia/:cantidad", (req, res) -> {
    res.type("application/json");
    int cantidadCopias = Integer.parseInt(req.params(":cantidad"));
     
    int indiceCopia = 1;
        for (Libro libroCopiar : libros) {
            for (int i = 0; i < cantidadCopias; i++) {
                copias.add(addCopia(
                        indiceCopia,
                        "DISPONIBLE",
                        libroCopiar.nombre,
                        libroCopiar.tipo,
                        libroCopiar.editorial,
                        libroCopiar.año,
                        libroCopiar.autores));
                indiceCopia++;
            }
        }

        return gson.toJson(copias);
});      

get("/agregarLector/:numSocio/:nombre/:apellidos/:direccion/multa", (req, res) -> {
        res.type("application/json");

        int numSocio = Integer.parseInt(req.params(":numSocio"));
        String nombre = req.params(":nombre");
        String apellido = req.params(":apellido");
        String direccion = req.params(":direccion");
        String multaString = req.params(":multa");
        Multa multa = gson.fromJson(multaString, Multa.class);
        
        lectores.add(addLector(numSocio, nombre, apellido, direccion, multa));         
        return gson.toJson(lectores);
        });  

get("/prestamos/:fechaInicio/:fechaFin/copia/:identificador/:lector/:numSocio/:id", (req, res) -> {

            // Obtener parámetros de la URL
            String fechaInicio = req.params(":fechaInicio");
            String fechaFin = req.params(":fechaFin");
            int identificador = Integer.parseInt(req.params(":identificador"));
            int numSocio = Integer.parseInt(req.params(":numSocio"));
            int id = Integer.parseInt(req.params(":id"));

            Copia copia = gson.fromJson(req.params(":copia"), Copia.class);
            Lector lector = gson.fromJson(req.params(":lector"), Lector.class);

            // Buscar la copia por el identificador y cambiar su estado
            Copia copiaPrestar = null;
            for (Copia c : copias) {
                if (c.getIdentificador() == identificador) {
                    c.setEstado("PRESTADO");
                    copiaPrestar = c;
                    break;
                }
            }
            // Si se encontro la copia, agregar el prestamo
            if (copiaPrestar != null && lector.getNumSocio() == numSocio) {
                prestamos.add(nuevoPrestamo(fechaInicio, fechaFin, copiaPrestar, lector, id));
            }
        return gson.toJson(prestamos);
        });



}

    public static Libro addLibro(String nombre, String tipo, String editorial, int año, LinkedList<Autor> autores) {
        Libro libro = new Libro(nombre, tipo, editorial, año, autores);
        return libro;
    }
    
    public static Autor addAutor(String nombre, String nacionalidad, String fechaNacimiento, LinkedList<Libro> libros) {
        Autor autor = new Autor(nombre, nacionalidad, fechaNacimiento, libros);
        return autor;
    }
    
        public static Copia addCopia(int id, String estado, String nombre, String tipo, String editorial, int anio, LinkedList<Autor> autores) {
        Copia copia = new Copia(id, estado, nombre, tipo, editorial, anio, autores);
        return copia;
    }
    
    public static Lector addLector(int numSocio, String nombre, String apellido, String direccion,Multa multa) {
        // dejamos el ultimo en null porque este no tiene multas apenas lo creamos
        Lector lector = new Lector(numSocio, nombre, apellido, direccion, null);
        return lector;
    }
    
    public static Prestamo nuevoPrestamo(String fechaInicio, String fechaFin, Copia copia, Lector lector,int id) {
        Prestamo prestamo = new Prestamo(fechaInicio, fechaFin, copia, lector, id);
        return prestamo;
    }
    
    public static Multa nuevaMulta(int id, String fechaInicio, String fechaFin, Lector lector, Prestamo prestamo) {
        Multa multa = new Multa(fechaInicio, fechaFin, prestamo, lector, id);
        return multa;
    }
    
private static Lector obtenerNumSocio(int numSocio) {
    // Aquí estoy utilizando una lista en memoria para simular el almacenamiento
    for(Lector lector  : lectores){
        if (Integer.valueOf(lector.getNumSocio()).equals(numSocio)) {
            return lector;
        }
    }
        return null;
    }
    
    // Método para obtener un Libro por nombre 
private static Libro obtenerLibroPorNombre(String nombre) {
    for (Libro libro : libros) {
        if (libro.getNombre().equals(nombre)) {
            return libro;
        }
    }
    return null;
}

private static void inicializarDatos() {
    //Aqui pensaba poner todas las instancias, profe no me dio el tiempo para añadir todo lo demas :(
    }
}
