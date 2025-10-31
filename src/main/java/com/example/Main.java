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

        System.out.println("\n==== FOR ====");

        System.out.println("\n== Números Pares del 2 al 20 ==");
        
        for(int p = 2; p <= 20; p +=2){
            System.out.println(p);
        }

        System.out.println("\n == FACTORIAL ==");
        int numeroFactorial = 5;
        long factorial = 1;
        for (int k = 1; k <= numeroFactorial; k++) {
            factorial *= k;
        }
        System.out.println("El factorial de " + numeroFactorial + " es: " + factorial);

        System.out.println("\n== SUMA DE ARREGLO ==");
        int [] forArreglo = {2, 4};
        int sumaArreglos = 0;

        for (int j = 0; j < forArreglo.length; j++) {
                sumaArreglos += forArreglo[j];
        }
           System.out.println("La suma del arreglo es: " + sumaArreglos);

           System.out.println("\n==== FOR-EACH ====");

        System.out.println("\n== Suma con for-each ==");
        int[] numerosArray = {4, 8, 15, 16, 23, 42};
        int sumaForEach = 0;
        for (int num : numerosArray) {
            sumaForEach += num;
        }
        System.out.println("La suma del arreglo es: " + sumaForEach);

        System.out.println("\n == Lista de palabras ==");
        String[] palabras = {"Java", "Python", "JavaScript", "C++", "Ruby"};
        for (String palabra : palabras) {
            System.out.println("- " + palabra);
        }

        System.out.println("\n == Promedio de calificaciones ==");
        double[] calificaciones = {5.0, 2.9, 3.0, 4.5, 1, 4.2};
        double sumaCalificaciones = 0;
        for (double calificacion : calificaciones) {
            sumaCalificaciones += calificacion;
        }
        double promedio = sumaCalificaciones / calificaciones.length;
        System.out.printf("El promedio es: %.2f\n", promedio);

        System.out.println("\n ==== BREAK && CONTINUE ====");

        System.out.println("\n == Break - For (Break al encontrar número mayor que 15)==");
        for (int m = 1; m <= 20; m++) {
            if (m > 15) {
                System.out.println("Número mayor que 15 encontrado. Deteniendo ciclo.");
                break;
            }
            System.out.print(m + "\n");
        }
        System.out.println();

        System.out.println("\n == Continue para mostrar solo números pares ==");
        for (int o = 1; o <= 10; o++) {
            if (o % 2 != 0) {
                continue;
            }
            System.out.print(o + "\n");
        }
        System.out.println();

         System.out.println("\n == Combinación break y continue ==");
        System.out.println("Procesando números (omite múltiplos de 3, se detiene al llegar a 25):");
        for (int p = 1; p <= 30; p++) {
            if (p > 25) {
            System.out.println("Límite alcanzado en " + p);
            break;
            }
            if (p % 3 == 0) {
                continue;
            }
            System.out.print(p + " \n");
        }
        
        System.out.println("\n\n=== TODOS LOS EJERCICIOS COMPLETADOS ===");
    }
}