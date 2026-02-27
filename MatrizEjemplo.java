/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erikg
 */
public class MatrizEjemplo {
    public static void main(String[] args) {

        // Declarar matriz 3x3
        int[][] matriz = {
            {1, 2, 3},
            {2, 4, 8},
            {3, 9, 27}
        };

        // Recorrer matriz con ciclos
        System.out.println("Los elementos de la matriz de 3X3 son:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j]+"   ");
            }
            System.out.println("");
        }
    }
}
