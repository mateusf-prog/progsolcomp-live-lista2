/* Nome do Aluno: Mateus Fonseca
* RA: 722311324
* Nome do Programa: Imprimior o maior número
* Data: 09/05/2023
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.println("Digite dois números: ");
        A = sc.nextInt();
        B = sc.nextInt();

        if (A > B) {
            System.out.printf("Número maior: %d%n", A);
        } else {
            System.out.printf("Número maior: %d%n", B);
        }

        sc.close();
    }
}