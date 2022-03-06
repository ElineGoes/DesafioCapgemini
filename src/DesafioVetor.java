import java.util.Scanner;

public class DesafioVetor {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de elementos do vetor: ");
        n = sc.nextInt();
        int[] vetor = new int[n];
        System.out.println("Digite os elementos do vetor: ");
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }

        System.out.println("Digite o Valor de X: ");

        int x = sc.nextInt();
        System.out.println(totalParesDiferencaX(vetor, x));

    }

    static int totalParesDiferencaX(int[] vetor, int x) {

        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            for (int z = 0; z < vetor.length; z++) {
                if (vetor[i] - vetor[z] == x) {
                    contador = contador + 1;
                }
            }
        }
        return contador;
    }
}
