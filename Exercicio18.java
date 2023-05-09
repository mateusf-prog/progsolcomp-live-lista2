/* Nome do Aluno: Mateus Fonseca 
* RA: 722311324
* Nome do Programa: Determine o fatorial de um número
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para calcular seu fatorial: ");
        int n = sc.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.printf("O fatorial de %d é %d.%n", n, fatorial);

        sc.close();
    }
}