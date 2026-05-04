package saidmb;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cambio en rama");

        mostrarSaludo("Juan");
        despedirUsuario("Juan");
    }

    public static void mostrarSaludo(String nombre) {
        System.out.println("Hola, " + nombre + "!");

    }

    public static void despedirUsuario(String nombre) {
        System.out.println("Adiós, " + nombre + "!");
    }
}

