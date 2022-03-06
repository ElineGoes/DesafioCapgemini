import java.util.Arrays;

public class DesafioMediana {

    public static void main (String[] args){

        int[] listaInteiros = {9,2,1,4,3,5,7,5,7};
        System.out.println(retornaMediana(listaInteiros));

    }


    public static int retornaMediana (int[] listaInteiros) {
        Arrays.sort(listaInteiros);
        int indexMediana = listaInteiros.length / 2;
        return listaInteiros[indexMediana];
    }

}
