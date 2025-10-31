package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("==== EJERCICIOS CON WHILE ====");

        System.out.println("== Números del 1 al 10 ==");
        int contador = 1;
        while (contador<=10) {
            System.out.println(contador);
            contador++;
        }

        System.out.println("== Suma Acumulatíva ==");
        int n = 5; 
        int suma = 0;
        int i = 1;
        while (i <= n) {
            suma += i;
            i++;
        }
        System.out.println("La suma de 1 a " + n + " es: " + suma);

        System.out.println("== Buscar Número de Arreglo ==");
        int[] numeros = {2, 5, 8, 10, 15, 20};
        int numeroBuscado = 10;
        boolean encontrado = false;
        int indice = 1;
        while (indice < numeros.length && !encontrado) {
            if (numeros[indice] == numeroBuscado) {
                encontrado = true;
                System.out.println("Número " + numeroBuscado + " encontrado en posición " + indice);
            }
            indice++;
        }
        if (!encontrado) {
            System.out.println("Número " + numeroBuscado + " no encontrado");
        }


        System.out.println("\n===== Ciclo DO-WHILE ====");

        System.out.println("\n== Menú ==");
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println(" MENÚ ");
            System.out.println("1. Decir hola");
            System.out.println("2. Mostrar número favorito");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hola");
                    break;
                case 2:
                    System.out.println("Mi número favorito es el 7");
                    break;
                case 0:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);

        System.out.println("\n== Lectura De Números ==");
        System.out.println("2. Suma de números (ingrese 0 para terminar):");
        int numero;
        int sumaNumeros = 0;
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = entrada.nextInt();
            sumaNumeros += numero;
        } while (numero != 0);
        System.out.println("La suma total es: " + sumaNumeros);
        

        System.out.println("\n == Validación Contraseña ==");
         System.out.println("3. Validación de contraseña:");
        String contraseñaCorrecta = "java123";
        String contraseñaIngresada;
        do {
            System.out.print("Ingrese la contraseña: ");
            contraseñaIngresada = entrada.next();
            if (!contraseñaIngresada.equals(contraseñaCorrecta)) {
                System.out.println("Contraseña incorrecta. Intente nuevamente.");
            }
        } while (!contraseñaIngresada.equals(contraseñaCorrecta));
        System.out.println("¡Contraseña correcta! Acceso concedido.");
        entrada.close();
    }
}