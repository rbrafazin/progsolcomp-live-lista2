/* Nome do Aluno: Rafael Brandão Barreto
* RA: 12723117653
* Nome do Programa: Ex7.java
* Data: 20/05/2023
*/

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de diárias: ");
        int diaria = sc.nextInt();
        sc.close();
        if (diaria > 15) {
            double diariamaior = 60 + (diaria * 5.5);
            System.out.printf("O valor total da hospedagem é R$%.2f", diariamaior);
        } else if (diaria == 15) {
            double diariaigual = 60 + (diaria * 6);
            System.out.printf("O valor total da hospedagem é R$%.2f", diariaigual);
        } else {
            double diariamenor = 60 + (diaria * 8);
            System.out.printf("O valor total da hospedagem é R$%.2f", diariamenor);
        }
    }
}
