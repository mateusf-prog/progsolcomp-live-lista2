/* Nome do Aluno: Mateus Fonseca 
* RA: 722311324
* Nome do Programa: Mostrar tabuada de 1 até o número digitado
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println();
        }

        sc.close();
    }
}