package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Git");
    }
    private static int menuPrincipal(){
        Scanner tecl=new Scanner(System.in);
        int opcion;//Opcion convertida a numero
        while(true){
            System.out.println("1. Estado");
            System.out.println("2. Comer");
            System.out.println("3. Jugar");
            System.out.println("4. Dormir");
            System.out.println("---");
            System.out.println("0. Salir");
            System.out.println("Selecciona una opción del menú:");
            try{
                opcion=Integer.parseInt(tecl.nextLine());//Conversión a numero
                //Validar 0,1,2,3 o 4.
                if (opcion>=0 && opcion<=4){
                    return opcion;//Solo devuelve opciones válidas.
                }else{
                    System.out.println("Opción no válida, intente de nuevo.");
                }
            }catch (NumberFormatException e){// NumberFormatException es el tipo específico de error (formato numérico inválido)
                System.out.println("Entrada inválida, debe ser un numero.");
            }
        }
    }
}