/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erikg
 */
public class ArregloEjemplo {

    public static void main(String[] args) {        
        // 1. Crear un arreglo de enteros
        int[] miArreglo = {10, 20, 30, 40, 50};

        // 2. Mostrar un valor específico del arreglo
        System.out.println("En la posición 2, se encuentra el valor: " + miArreglo[2]+ "\n");

        // 3. Recorrer el arreglo usando un ciclo for
        System.out.println("Recorrido del arreglo:");
        for (int cont = 0; cont < miArreglo.length; cont++) {
            System.out.println("Posición " + cont + ": " + miArreglo[cont]);
        }
    }
}
