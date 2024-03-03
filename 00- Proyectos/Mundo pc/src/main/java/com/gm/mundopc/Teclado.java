
package com.gm.mundopc;


public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclado;
   
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclado;
        
    }
    
    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", contadorTeclado=" + contadorTeclado + '}';
    }
    
    public static void main(String[] args){
        Teclado tecladoHP = new Teclado("HP", "HP");
    }
    
}
