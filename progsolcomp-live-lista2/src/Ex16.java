/* Nome do Aluno: Rafael Brandão Barreto
* RA: 12723117653
* Nome do Programa: Ex16.java
* Data: 20/05/2023
*/

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
        } while (numero >= 0);
        System.out.println("Você digitou um número menor que 0. Fim do programa.");
        sc.close();
    }
}
