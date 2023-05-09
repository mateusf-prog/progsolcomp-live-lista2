/* Nome do Aluno: Mateus Fonseca
* RA: 722311324
* Nome do Programa: Imprimior em ordem crescente
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = sc.nextInt();

        System.out.print("Ordem crescente: ");
        if (a <= b && b <= c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a <= c && c <= b) {
            System.out.println(a + " " + c + " " + b);
        } else if (b <= a && a <= c) {
            System.out.println(b + " " + a + " " + c);
        } else if (b <= c && c <= a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c <= a && a <= b) {
            System.out.println(c + " " + a + " " + b);
        } else { // c <= b && b <= a
            System.out.println(c + " " + b + " " + a);
        }

        sc.close();
    }
}
