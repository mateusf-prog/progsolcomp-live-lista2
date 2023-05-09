/* Nome do Aluno: Mateus Fonseca 
* RA: 722311324
* Nome do Programa: Aplicar desconto
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precoFinal=0.0, venda;
        int condicao; 

        System.out.print("Digite o valor da venda : R$");
        venda = sc.nextDouble();
        System.out.println("-escolha a forma de pagamento-");
        System.out.println("1: Venda à vista - desconto de 10%;");
        System.out.println("2: Venda a prazo 30 dias - desconto de 5%;");
        System.out.println("3: Venda a prazo 60 dias - mesmo preço;");
        System.out.println("4: Venda a prazo 90 dias - acréscimo de 5%;");
        System.out.println("5: Venda no cartão de débito - desconto de 8%;");
        System.out.println("6: Venda no cartão de crédito - desconto de 7%.");
        System.out.print("Digite a condição desejada: ");
        condicao = sc.nextInt();
    
        switch (condicao) {
            case 1:
                System.out.println("Aplicando desconto de 10% ...");
                precoFinal = venda - (venda * 0.10);
                break;
            case 2:
                System.out.println("Aplicando desconto de 5% ...");
                precoFinal = venda - (venda * 0.05);
                break;
            case 3:
                System.out.println("Sem desconto aplicado.");
                precoFinal = venda;
                break;
            case 4:
                System.out.println("Aplicando acréscimo de 5% ...");
                precoFinal = venda + (venda * 0.05);
                break;
            case 5:
                System.out.println("Aplicando desconto de 8% ...");
                precoFinal = venda - (venda * 0.08);
                break;
            case 6:
                System.out.println("Aplicando desconto de 7% ...");
                precoFinal = venda - (venda * 0.07);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    
        System.out.printf("O preço final é R$ %.2f%n", precoFinal);
    
        sc.close();
    }
}
