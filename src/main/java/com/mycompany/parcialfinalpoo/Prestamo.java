package com.mycompany.parcialfinalpoo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestamo {
    private final String fechaInicio;
    private String fechaFin;
    private Copia copia;
    private Lector lector;
    private int id;

    public Prestamo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.fechaInicio = sdf.format(new Date());
    }

    public Prestamo(String fechaInicio, String fechaFin, Copia copia, Lector lector, int id) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.copia = copia;
        this.lector = lector;
        this.id = id;
    }

    public Lector getLector() {
        return lector;
    }

    public int getId() {
        return id;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getFechaInicio() {
        return fechaInicio;
    }
    
    public String getFechaFin() {
        return fechaFin;
    }

    public Copia getCopia() {
        return copia;
    }

    public void setCopia(Copia copia) {
        this.copia = copia;
    }

//    public void calcularFechaFin() {
//        if (copia.getEstado().equals("Prestado")) {
//            // Lógica para calcular la fecha de fin (segun tus requerimientos)
//            try {
//                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//                Date fechaInicioPrestamo = sdf.parse(fechaInicio);
//
//                // Supongamos que el préstamo es por 7 días
//                Date fechaFinPrestamo = new Date(fechaInicioPrestamo.getTime() + 7 * 24 * 60 * 60 * 1000);
//
//                this.fechaFin = sdf.format(fechaFinPrestamo);
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
//        } else {
//            this.fechaFin = "Sin multa";
//        }
//    }
}
 