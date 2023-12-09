package com.mycompany.parcialfinalpoo;
import java.util.LinkedList;

/**
 *
 * @author JORS SOLARTE
*/
public class Lector {
public int numSocio;
    public String nombre;
    public String apellidos;
    public String direccion;
    public Multa multa;


    public Lector(int numSocio, String nombre, String apellidos, String direccion, Multa multa) {
        this.numSocio = numSocio;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.multa = multa;
    }
 
    public int getNumSocio() {
        return numSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public Multa getMulta() {
        return multa;
    }
    
    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

//
//    public boolean puedeTomarPrestado() {
//        return copiasPrestadas.size() < 3;
//    }


//    public LinkedList<Multa> multasPendientes() {
//        LinkedList<Multa> multasPendientes = new LinkedList<>();
//
//        for (Copia copia : copiasPrestadas) {
//            Prestamo prestamo = new Prestamo();
//            prestamo.setCopia(copia);
//            prestamo.calcularFechaFin();
//
//             Multa multa = new Multa();
//            multa.setPrestamo(prestamo);
//            multa.calcularFechaFin();
//
//            if (!"Sin multa".equals(multa.getFechaFin())) {
//                multasPendientes.add(multa);
//            }
//        }
//
//        return multasPendientes;
//    }
}


