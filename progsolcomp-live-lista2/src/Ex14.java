/* Nome do Aluno: Rafael Brandão Barreto
* RA: 12723117653
* Nome do Programa: Ex14.java
* Data: 20/05/2023
*/

public class Ex14 {
    public static void main(String[] args) {
        int[] vetor = new int[50];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }

        System.out.println("Vetor preenchido com zeros: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
