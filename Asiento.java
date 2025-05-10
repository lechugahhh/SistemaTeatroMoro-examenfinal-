package com.sistemateatromoro;

public class Asiento {
   private String ubicacion; 
   private boolean disponible;
   
   public Asiento(String ubicacion) {
       this.ubicacion = ubicacion;
       this.disponible = true;   
   }
   
   public String getUbicacion() {
       return ubicacion;
   }
   
   public boolean isDisponible() {
       return disponible;
   }
   
   public void ocuparAsiento() {
       this.disponible = false;
   }
   
   public void liberarAsiento() {
       this.disponible = true;
   }
   
   @Override
   
   public String toString() {
       return "Asiento en " + ubicacion + " - Disponible " + disponible;
   }
   
}
