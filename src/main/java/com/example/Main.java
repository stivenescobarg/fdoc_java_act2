package com.example;

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

    }
}