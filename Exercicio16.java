/* Nome do Aluno: Mateus Fonseca 
* RA: 722311324
* Nome do Programa: Digitar um número até que esse número seja menor que 0
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número:");
        numero = sc.nextInt();

        while (numero >= 0) {
            System.out.println("Digite outro número:");
            numero = sc.nextInt();
        }

        System.out.println("Número digitado menor que zero.");

        sc.close();
    }
}