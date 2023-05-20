/* Nome do Aluno: Rafael Brandão Barreto
* RA: 12723117653
* Nome do Programa: Ex12.java
* Data: 20/05/2023
*/

public class Ex12 {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i % 7 != 0);
    }
}
