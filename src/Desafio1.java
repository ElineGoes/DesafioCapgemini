import java.util.ArrayList;

public class Desafio1 {

    public static void main (String[] args) {
        int a = 1;
        int b = 3;
        int c = 6;
        int d = 3;
        int e = 9;
        int f = 2;
        int resultado1;
        int resultado2;
        double resultado3;

        resultado1 = subtracao(a,b);
        resultado2 = multiplicacao(c,d);
        resultado3 = divisao(e,f);


    }

    static public int soma(int a , int b) {
        return a + b;
    }
    static public int subtracao(int a , int b) {
        return a - b;
    }
    static public int multiplicacao(int a , int b) {
        return a * b;
    }
    static public double divisao(double a , double b) {
        return a / b;
    }




}
