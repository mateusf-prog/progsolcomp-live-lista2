/* Nome do Aluno: Mateus Fonseca 
* RA: 722311324
* Nome do Programa: Calcular valor da hospedagem
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dias, precoFinal;

        System.out.print("Quantos dias você irá ficar hospedado? ");
        dias = sc.nextInt();

        if (dias > 15 ) {
            precoFinal = (int)(dias * 60) + (int)(dias * 5.50);
            System.out.println("Preço final: $ " + precoFinal);
        } else if (dias  == 15) {
            precoFinal = (int)(dias * 60) + (int)(dias * 6.0);
            System.out.println("Preço final: $ " + precoFinal);
        } else {
            precoFinal = (int)(dias * 60) + (int)(dias * 8.0);
            System.out.println("Preço final: $ " + precoFinal);
        }

        sc.close();
    }
}