package com.mycompany.parcialfinalpoo;

import java.util.LinkedList;

/**
 *
 * @author JORS SOLARTE
 */
public class Copia extends Libro {
    public int identificador;
    public String estado;
    private LinkedList<Autor> autores = new LinkedList<>();

    public Copia(int identificador, String estado, String nombre, String tipo, String editorial, int año, LinkedList<Autor> autores) {
        super(nombre, tipo, editorial, año, autores);
        this.identificador = identificador;
        this.estado = estado;
        this.autores = autores;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public int getAño() {
        return año;
    }
 
    public int getIdentificador() {
        return identificador;
    }

    public String getEstado() {
        return estado;
    }

    public LinkedList<Autor> getAutores() {
        return autores;
    }

    
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public void setAño(int año) {
        this.año = año;
    }


    
//    public void prestar(Lector lector) {
//        if (this.lector == null && lector.puedeTomarPrestado()) {
//            this.lector = lector;
//            estado = "Prestado";
//            lector.prestarCopia(this);
//        }
//    }

    
//    public void devolver() {
//        if (lector != null) {
//            lector.devolverCopia(this);
//            lector = null;
//        }
//        estado = "Disponible";
//    }

    public void setAutores(LinkedList<Autor> autores) {
        this.autores = autores;
    }
    
}
