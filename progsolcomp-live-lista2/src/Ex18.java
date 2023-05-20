/* Nome do Aluno: Rafael Brandão Barreto
* RA: 12723117653
* Nome do Programa: Ex18.java
* Data: 20/05/2023
*/

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();
        sc.close();
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.printf("O fatorial de %d é %d.", numero, fatorial);
    }
}
