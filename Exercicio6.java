/* Nome do Aluno: Mateus Fonseca 
* RA: 722311324
* Nome do Programa: Imprimir na tela o conceito de um aluno 
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota final: ");
        int note = sc.nextInt();

        if (note == 0 || note <= 49) {
            System.out.println("Insuficiente!");
        } else if (note <= 64) {
            System.out.println("Regular!");
        } else if (note <= 84) {
            System.out.println("Bom!");
        } else if (note <= 100) {
            System.out.println("Ótimo!");
        } else {
            System.out.println("Digitação errada, tente novamente!");
        }

        sc.close();
    }
}