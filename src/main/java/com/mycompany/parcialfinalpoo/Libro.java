package com.mycompany.parcialfinalpoo;
import java.util.LinkedList;
/**
 *
 * @author JORS SOLARTE
 */
public class Libro {
    public String nombre;
    public String tipo;
    public String editorial;
    public int año;
    LinkedList<Autor> autores = new LinkedList<>();

    public Libro(String nombre, String tipo, String editorial, int año, LinkedList<Autor> autores) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.editorial = editorial;
        this.año = año;
        this.autores = autores;
    }

    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAño() {
        return año;
    }

    public LinkedList<Autor> getAutores() {
        return autores;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setAutores(LinkedList<Autor> autores) {
        this.autores = autores;
    }    
}

