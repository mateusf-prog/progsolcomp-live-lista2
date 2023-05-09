/* Nome do Aluno: Mateus Fonseca 
* RA: 722311324
* Nome do Programa: Imprimir os múltiplos negativos de 7
* Data: 09/05/2023
*/

public class Exercicio17 {
    public static void main(String[] args) {

        int num = -7;
        
        do {
            System.out.println(num);
            num -= 7;
        } while (num > -1000);
    }
}

