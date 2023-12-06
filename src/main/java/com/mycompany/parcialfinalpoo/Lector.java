package com.mycompany.parcialfinalpoo;
/**
 *
 * @author JORS SOLARTE
 */
public class Lector {
    public String numSocio;
    public String nombre;
    public String apellidos;
    public String direccion;
    private Copia[] copia;
    
    public Lector(){
        copia = new Copia[3];
    }

    public Lector(String numSocio, String nombre, String apellidos, String direccion, Copia[] copia) {
        this.numSocio = numSocio;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.copia = copia;
    }
 public boolean tieneMultasPendientes() {
    if (copia != null) {
        for (Copia copia : copia) {
            if (copia != null && copia.tieneMultaPendiente()) {
                return true; 
            }
        }
    }
    return false; 
}

}
