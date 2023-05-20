/* Nome do Aluno: Rafael Brandão Barreto
* RA: 12723117653
* Nome do Programa: Ex15.java
* Data: 20/05/2023
*/
public class Ex15 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        System.out.println("Matriz preenchida com zeros: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
