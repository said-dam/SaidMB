package saidmb;

public class Main {
    public static void main(String[] args) {
        iniciarPrograma();

        mostrarSaludo("Juan");
        despedirUsuario("Juan");
    }

    private static void iniciarPrograma() {
        System.out.println("Programa iniciado");
    }

    public static void mostrarSaludo(String nombre) {
        System.out.println("Hola, " + nombre + "!");

    }

    public static void despedirUsuario(String nombre) {
        System.out.println("Adiós, " + nombre + "!");
    }
}

