package com.mycompany.parcialfinalpoo;
import java.util.LinkedList;
/**
 *
 * @author JORS SOLARTE
 */
public class Autor {
    public String nombre;
    public String nacionalidad;
    public String fechaNacimiento;
    private LinkedList<Libro> libros = new LinkedList<>();

    public Autor(String nombre, String nacionalidad, String fechaNacimiento, LinkedList<Libro> libros1) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;  
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }
    
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        libro.getAutores().add(this);  // Establecer la relación en ambos sentidos
    }
}
