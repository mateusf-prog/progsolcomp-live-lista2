/* Nome do Aluno: Mateus Fonseca 
* RA: 722311324
* Nome do Programa: Preencher com zero as posições de um vetor de tamanho 50
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[50];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        sc.close();
    }
}