/* Nome do Aluno: Mateus Fonseca
* RA: 722311324
* Nome do Programa: Múltiplus
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor A: ");
        int A = sc.nextInt();
        System.err.print("Valor B: ");
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        sc.close();
    }
}