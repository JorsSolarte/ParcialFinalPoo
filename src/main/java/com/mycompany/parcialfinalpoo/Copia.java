package com.mycompany.parcialfinalpoo;
/**
 *
 * @author JORS SOLARTE
 */
public class Copia {
    public String identificador;
    public String estado;
    private Lector lector;
    private boolean multaPendiente;

    public Copia(String identificador, String estado, Lector lector, boolean multaPendiente) {
        this.identificador = identificador;
        this.estado = estado;
        this.lector = lector;
        this.multaPendiente = multaPendiente;
    }
    public boolean tieneMultaPendiente(){
        return multaPendiente;    
    }
}
