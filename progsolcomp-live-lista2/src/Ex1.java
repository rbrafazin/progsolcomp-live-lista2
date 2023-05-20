/* Nome do Aluno: Rafael Brandão Barreto
* RA: 12723117653
* Nome do Programa: Ex1.java
* Data: 20/05/2023
*/

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();
        sc.close();
        double maior = a;
        if (b > a) {
            maior = b;
        }
        System.out.printf("O maior número é %f", maior);
    }
}
