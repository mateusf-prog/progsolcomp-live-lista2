/* Nome do Aluno: Mateus Fonseca 
* RA: 722311324
* Nome do Programa: Imprimir mês e estação
* Data: 09/05/2023
*/

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String month="";

        System.out.print("Entre com um número correspondente ao mês do ano: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                month = "Janeiro - Verão";
                break;
            case 2:
                month = "Fevereiro - Verão";
                break;
            case 3:
                month = "Março - Verão";
                break;
            case 4:
                month = "Abril - Outono";
                break;
            case 5:
                month = "Maio - Outono";
                break;
            case 6:
                month = "Junho - Outono";
                break;
            case 7:
                month = "Julho - Inverno";
                break;
            case 8:
                month = "Agosto - Inverno";
                break;
            case 9:
                month = "Setembro - Inverno";
                break;
            case 10:
                month = "Outubro - Primavera";
                break;
            case 11:
                month = "Novembro - Primavera";
                break;
            case 12:
                month = "Dezembro - Primavera";
                break;
        }

        System.out.println(month);

        sc.close();
    }
}