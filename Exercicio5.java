/* Nome do Aluno: Mateus Fonseca
* RA: 722311324
* Nome do Programa: Imprimir dados digitados conforme condição
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Digite a sua idade em anos: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a sua naturalidade: ");
        String naturalidade = sc.nextLine();

        System.out.print("Deseja visualizar dados completos? (S/N): ");
        char opcao = sc.nextLine().charAt(0);

        if (opcao == 'S') {
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Naturalidade: " + naturalidade);
        } else if (opcao == 'N') {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + " anos");
        } else {
            System.out.println("Digitação errada. Tente Novamente.");
        }

        sc.close();
    }
}
