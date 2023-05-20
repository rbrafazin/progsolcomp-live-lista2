/* Nome do Aluno: Rafael Brandão Barreto
* RA: 12723117653
* Nome do Programa: Ex20.java
* Data: 20/05/2023
*/

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a carga máxima do elevador em kg: ");
        int cargaMaxima = sc.nextInt();
        System.out.print("Digite a quantidade máxima de pessoas no elevador: ");
        int maximoPessoas = sc.nextInt();
        int pesoAtual = 0;
        int pessoas = 0;
        do {
            System.out.print("Digite o peso da pessoa em kg: ");
            int pesoPessoa = sc.nextInt();
            if (pesoAtual + pesoPessoa <= cargaMaxima && pessoas + 1 <= maximoPessoas) {
                pesoAtual += pesoPessoa;
                pessoas++;
            } else {
                System.out.println(
                        "Limite de carga ou quantidade de pessoas atingido. Não é possível adicionar mais pessoas.");
                break;
            }
        } while (true);
        System.out.printf("O elevador está com um total de %d pessoa(s) e uma carga de %d kg.", pessoas, pesoAtual);
        sc.close();
    }
}
