/* Nome do Aluno: Rafael Brandão Barreto
* RA: 12723117653
* Nome do Programa: Ex19.java
* Data: 20/05/2023
*/

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o volume em centímetros cúbicos: ");
        int volumeInicial = sc.nextInt();
        sc.close();
        int volumeAtual = volumeInicial;
        int tempo = 0;
        while (volumeAtual <= 1000) {
            volumeAtual *= 2;
            tempo++;
        }
        System.out.printf("O volume ultrapassou 1000 centímetros cúbicos em %d segundos.", tempo);
    }
}
