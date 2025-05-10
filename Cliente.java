package com.sistemateatromoro;

public class Cliente {
    
    private String nombre;
    private int edad;
    private String tipoCliente;
    private String sexo;
    private boolean esEstudiante;
    public String getTipoCliente() { return tipoCliente; }
    public String getSexo() { return sexo; }
    public boolean isEstudiante() { return esEstudiante; }

    
    public Cliente(String nombre, int edad, String tipoCliente, String sexo, boolean esEstudiante) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoCliente = tipoCliente;
        this.sexo = sexo;
        this.esEstudiante = esEstudiante;
    }
    
    public int calcularDescuento() {
        int descuento = 0;
        
        switch (tipoCliente.toLowerCase()) {
            case "niño": descuento += 10; break;
            case "tercera edad": descuento += 25; break;
        }
    
        if (sexo.equalsIgnoreCase("Mujer")) {
            descuento += 20;
        }
        
        if (esEstudiante) {
            descuento += 15;
        }
        
        return descuento;
    }
 
    public String getNombre() {
        return nombre;
    }
    
}
