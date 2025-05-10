package com.sistemateatromoro;

import java.util.ArrayList;
import java.util.List;



public class VentaEntradas {
    private List<Asiento> asientos;
    
    public VentaEntradas() {
        asientos = new ArrayList<>();
        
        // Tipos de asientos
        
        asientos.add(new Asiento("VIP"));
        asientos.add(new Asiento("Platea baja"));
        asientos.add(new Asiento("Platea alta"));
        asientos.add(new Asiento("Galería"));    
    }
    
    public void realizarCompra(Cliente cliente, String tipoAsiento) {
        Asiento asientoSeleccionado = null;
        for (Asiento asiento : asientos) {
            if (asiento.getUbicacion().equalsIgnoreCase(tipoAsiento) && asiento.isDisponible()) {
                asientoSeleccionado = asiento;
                break;
            }
        }
        
        if (asientoSeleccionado != null) {
            asientoSeleccionado.ocuparAsiento();
            double precioBase = 10000; // Precio entrada
            double descuento = cliente.calcularDescuento();
            double precioFinal = precioBase - (precioBase * descuento / 100);
            
            imprimirBoleta(cliente, asientoSeleccionado.getUbicacion(), precioFinal);
        } else {
            System.out.println("Lo siento, el asiento seleccionado no está disponible.");
        }
    }
    
    private void imprimirBoleta(Cliente cliente, String asiento, double precio) {
        System.out.println("\n--- Boleta ---");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Categoría: " + cliente.getTipoCliente());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Estudiante: " + (cliente.isEstudiante() ? "Sí" : "No"));
        System.out.println("Asiento: " + asiento);
        System.out.println("Precio final: $" + precio);
        System.out.println("----------------------\n");
    }
    
}