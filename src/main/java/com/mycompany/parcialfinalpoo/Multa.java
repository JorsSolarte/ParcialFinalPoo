package com.mycompany.parcialfinalpoo;  
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author JORS SOLARTE
 */
public class Multa {
    private String fechaInicio;
    private String fechaFin;
    private Prestamo prestamo;
    private Lector lector;
    private int id;

    public Multa() {
        this.fechaInicio = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    }

    public Multa(String fechaInicio, String fechaFin, Prestamo prestamo, Lector lector, int id) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.prestamo = prestamo;
        this.lector = lector;
        this.id = id;
    }

    public int getId() {
        return id;
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

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public Lector getLector() {
        return lector;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    
//    public void calcularFechaFin() {
//        if (prestamo != null && prestamo.getFechaFin() != null) {
//            try {
//                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//                Date fechaFinPrestamo = sdf.parse(prestamo.getFechaFin());
//
//                // Calcular la fecha de fin de la multa (una semana después de la fecha de fin del préstamo)
//                Date fechaFinMultaDate = new Date(fechaFinPrestamo.getTime() + 7 * 24 * 60 * 60 * 1000);
//                fechaFin = sdf.format(fechaFinMultaDate);
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    
}
