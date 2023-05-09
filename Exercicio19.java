/* Nome do Aluno: Mateus Fonseca 
* RA: 722311324
* Nome do Programa: Cálculo do tempo necessário
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int volume, contador;

        System.out.print("Digite o volume em c³: ");
        volume = sc.nextInt();

        contador = 1;
        while (volume <= 1000) {
            volume *= 2;
            contador ++;
        }

        System.out.println("Tempo necessário: " + contador);

        sc.close();
    }
}