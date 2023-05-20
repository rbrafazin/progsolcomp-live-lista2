/* Nome do Aluno: Rafael Brandão Barreto
* RA: 12723117653
* Nome do Programa: Ex2.java
* Data: 20/05/2023
*/

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        double c = sc.nextDouble();
        sc.close();
        if (a <= b && a <= c && b <= c) {
            System.out.printf("%f, %f, %f", a, b, c);
        } else if (a <= b && a <= c && b >= c) {
            System.out.printf("%f, %f, %f", a, c, b);
        } else if (b <= a && b <= c && a <= c) {
            System.out.printf("%f, %f, %f", b, a, c);
        } else if (b <= a && b <= c && a >= c) {
            System.out.printf("%f, %f, %f", b, c, a);
        } else if (a <= b) {
            System.out.printf("%f, %f, %f", c, a, b);
        } else {
            System.out.printf("%f, %f, %f", c, b, a);
        }
    }
}
