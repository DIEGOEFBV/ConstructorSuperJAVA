package org.empresa;

public class Main {
    public static void main(String[] args) {
        Auto a = new Auto(true, "MarcaCarro", "XYZ", "ABC123");
        Moto m = new Moto("MarcaMoto","NZ","CBA321",2);
        a.acelerar();
        a.prenderAire();
        m.hacerWheelie();
        System.out.println(a);
        System.out.println(m);
    }
}