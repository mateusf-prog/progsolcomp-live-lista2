/* Nome do Aluno: Mateus Fonseca 
* RA: 722311324
* Nome do Programa: Encontrar múltiplo de 7
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 0;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i % 7 != 0);

        sc.close();
    }
}

