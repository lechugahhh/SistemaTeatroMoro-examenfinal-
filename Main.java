package com.sistemateatromoro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar datos de usuario
        
        System.out.println("Bienvenido al Teatro Moro");
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar scanner
        
        // Determinar edad
        
        String tipoCliente;
        if (edad<18) {
            tipoCliente = "Niño";
        } else if (edad>60) {
            tipoCliente = "Tercerda edad";
        } else {
            tipoCliente = "Adulto";
        }
        
        // Solicitar sexo
        
        System.out.println("Ingrese su sexo: ");
        String sexo = scanner.nextLine();
        
        // Preguntar estudiante
        
        System.out.println("¿Es estudiante?: ");
        String respuesta = scanner.nextLine();
        boolean esEstudiante = respuesta.equalsIgnoreCase("Sí");
        
        // Crear cliente
        
        Cliente cliente = new Cliente(nombre, edad, tipoCliente, sexo, esEstudiante);
     
        System.out.println("\nCliente creado existosamente: " + cliente.getNombre());
        System.out.println("Categoría: " + tipoCliente);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estudiante: " + (esEstudiante ? "Sí" : "No"));
        System.out.println("Descuento aplicado: " + cliente.calcularDescuento() + "%");
        
        scanner.close();
    }
    
}