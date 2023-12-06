package com.mycompany.parcialfinalpoo;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author JORS SOLARTE
 */
public class Autor {
    public String nombre;
    public String nacionalidad;
    public Date fechaNacimiento;
    private ArrayList<Libro> libros;

    public Autor(String nombre, String nacionalidad, Date fechaNacimiento, Libro libro) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.libros.add(libro);
    }
    
    
}
