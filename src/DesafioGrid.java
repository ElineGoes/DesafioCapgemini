import java.util.Scanner;

public class DesafioGrid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o texto de entrada:");
        String texto = scanner.nextLine();
        texto = texto.replaceAll("\\s+", "");
        int textoLength = texto.length();
        Double raiz = Math.ceil(Math.sqrt(textoLength));
        int t = raiz.intValue();

        String[][] stringGrid = montaGrid (texto, t);
        imprimirGrid(stringGrid,t);




    }

    static String[][] montaGrid (String texto, int grid){
        String[][] stringGrid = new String[grid][grid];
        int contadorLetras = 0;

        int textoLength = texto.length();

        for (int i = 0; i < grid; i++) {
            for (int z = 0; z < grid; z++) {
                if (contadorLetras < textoLength) {
                    char c = texto.charAt(contadorLetras);
                    stringGrid[i][z] = String.valueOf(c);
                    contadorLetras = contadorLetras + 1;
                }
            }
        }

        return  stringGrid;
    }

    static void imprimirGrid (String[][] stringGrid, int t){
        for (int i = 0; i < t; i++) {
            for (int z = 0; z < t; z++) {
                if (stringGrid[z][i] != null){
                    System.out.print(stringGrid[z][i]);
                }
            }
            System.out.print(" ");
        }
    }
}
