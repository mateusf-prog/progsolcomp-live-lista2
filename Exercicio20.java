/* Nome do Aluno: Mateus Fonseca 
* RA: 722311324
* Nome do Programa: Carga elevador
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int cargaMaxima, capacidadeMaxima, pesoPessoa=0, contador=0, pesoTotal=0;

        System.out.print("Carga máxima: ");
        cargaMaxima = sc.nextInt();

        System.out.print("Quantidade máxima de pessoas: ");
        capacidadeMaxima = sc.nextInt();

        do {
            System.out.print("Digite o peso da pessoa: ");
            pesoPessoa = sc.nextInt();
            pesoTotal += pesoPessoa;
            contador++;
        } while (pesoTotal < cargaMaxima && contador < capacidadeMaxima);

        System.out.println("\nCapacidade máxima atingida!");
        System.out.println(pesoTotal + "kg");
        System.out.println(contador + " pessoas");

        sc.close();
    }
}
