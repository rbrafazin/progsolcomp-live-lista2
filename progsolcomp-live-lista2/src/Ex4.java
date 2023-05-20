/* Nome do Aluno: Rafael Brandão Barreto
* RA: 12723117653
* Nome do Programa: Ex4.java
* Data: 20/05/2023
*/

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();
        sc.close();
        if (n % 2 == 0 && n > 0) {
            System.out.printf("O número %d é Par e Positivo", n);
        } else if (n % 2 == 0 && n < 0) {
            System.out.printf("O número %d é Par e Negativo", n);
        } else if (n % 2 != 0 && n > 0) {
            System.out.printf("O número %d é Ímpar e Positivo", n);
        } else {
            System.out.printf("O número %d é Ímpar e Negativo", n);
        }
    }
}
