package org.empresa;

public class Moto extends Vehiculo {
    private int anchoDeManubrio;

    public Moto(String marca, String modelo, String patente, int anchoDeManubrio) {
        super(marca, modelo, patente);
        this.anchoDeManubrio = anchoDeManubrio;
    }

    // TAREA: Implementá el constructor de 'Moto' siguiendo las pautas de 'Auto'.
    public void hacerWheelie() {
        System.out.println("Haciendo wheelie...");
    }
}
