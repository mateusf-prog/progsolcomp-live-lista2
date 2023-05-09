/* Nome do Aluno: Mateus Fonseca 
* RA: 722311324
* Nome do Programa: Imprimir valor total da soma de 1 a 100
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int i = 1;
        
        while(i <= 100) {
            soma += i;
            i++;
        }
        
        System.out.println("O valor total da soma é: " + soma);

        sc.close();
    }
}