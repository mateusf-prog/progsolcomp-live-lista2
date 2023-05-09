/* Nome do Aluno: Mateus Fonseca
* RA: 722311324
* Nome do Programa: Par ou ímpar, negativo ou positivo
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if (num % 2 == 0 && num > 0) {
            System.out.println("O número é par e é positivo!");
        } else if (num % 2 == 0 && num < 0) {
            System.out.println("O número é par e é negativo");
        } else if (num % 2 != 0 && num > 0) {
            System.out.println("O número é ímpar e é positivo");
        } else if (num % 2 != 0 && num < 0) {
            System.out.println("O número é ímpar e é negativo!");
        }

        sc.close();
    }
}