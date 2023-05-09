/* Nome do Aluno: Mateus Fonseca 
* RA: 722311324
* Nome do Programa: Preencher com zero as posições de uma matriz 10x10
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[10][10];
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 0;
            }
        }
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}