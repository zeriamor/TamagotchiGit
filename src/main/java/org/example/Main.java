package org.example;

import java.util.Scanner;

public class Main {
    //***** EJERCICIO 6 *****//
    private static int saciedad = 6;
    private static int energia = 6;
    private static int diversion = 6;

    //*****************************************
    public static void main(String[] args) {
        Scanner teclMain = new Scanner(System.in);
        System.out.println("Hola Git");

        int opcion;
        System.out.println("¡Bienvenido a Tamagochi Git!");
        do {
            opcion = menuPrincipal();
            switch (opcion) {
                case 1 -> {
                    mostrarEstado();
                }
                case 2 -> {
                    System.out.println("Opción comer (ejercicio 8)");
                }
                case 3 -> {
                    System.out.println("Opción jugar (ejercicio 10)");
                }

                case 4 -> {
                    System.out.println("Opción dormir (ejercicio 11)");
                }

                case 0 -> {
                    System.out.println("Hasta pronto...");
                }

                default -> {
                    throw new IllegalStateException("Unexpected value: " + opcion);
                }
            }
        } while (opcion != 0);
        teclMain.close();

    }

    //***** EJERCICIO 5 *****//
    private static int menuPrincipal() {
        Scanner tecl = new Scanner(System.in);
        int opcion;//Opcion convertida a numero
        while (true) {
            System.out.println("1. Estado");
            System.out.println("2. Comer");
            System.out.println("3. Jugar");
            System.out.println("4. Dormir");
            System.out.println("---");
            System.out.println("0. Salir");
            System.out.println("Selecciona una opción del menú:");
            try {
                opcion = Integer.parseInt(tecl.nextLine());//Conversión a numero
                //Validar 0,1,2,3 o 4.
                if (opcion >= 0 && opcion <= 4) {
                    return opcion;//Solo devuelve opciones válidas.
                } else {
                    System.out.println("Opción no válida, intente de nuevo.");
                }
            } catch (
                    NumberFormatException e) {// NumberFormatException es el tipo específico de error (formato numérico inválido)
                System.out.println("Entrada inválida, debe ser un numero.");
            }
        }
    }

    //***** EJERCICIO 6 *****//
    //METODO , estado mediante Sprites
    private static void mostrarEstado() {
        System.out.println(">>> Estado del Tamagochi <<<");
        System.out.println("|-->Saciedad:" + saciedad + "/10");
        System.out.println("|-->Energia:" + energia + "/10");
        System.out.println("|-->Diversion:" + diversion + "/10");
        //Mostrar Sprites
        if (saciedad <= 0 || energia <= 0 || diversion <= 0) {
            // FIN DEL JUEGO - algún estado llega a 0
            System.out.println("\n(x_x) :( Game Over ):");
            System.out.println("/|_|\\");
            System.out.println(" | |");
        } else if (saciedad <= 4) {
            // HAMBRIENTO
            System.out.println("\n(._.) ¡Tengo hambre!");
            System.out.println("/|x|\\");
            System.out.println(" | |");
        } else if (energia <= 4) {
            // CANSADO
            System.out.println("\n(-_-) Zzz");
            System.out.println("/|_|\\");
            System.out.println(" | |");
        } else if (diversion <= 4) {
            // TRISTE
            System.out.println("\n(~_-) Estoy aburrido");
            System.out.println("/|_|\\ ¡Juega conmigo!");
            System.out.println(" / \\");

        } else if (saciedad > 5 && energia > 5 && diversion > 5) {
            // CONTENTO
            System.out.println("\n(*v*) ¡Estoy feliz!");
            System.out.println("/|_|\\");
            System.out.println(" | |");
        }
        System.out.println("=============================\n");
    }

}

