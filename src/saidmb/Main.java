package saidmb;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programa iniciado");

        saludarUsuario("Juan");
        despedirUsuario("Juan");
    }

    public static void saludarUsuario(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    public static void despedirUsuario(String nombre) {
        System.out.println("Adiós, " + nombre + "!");
    }
}

