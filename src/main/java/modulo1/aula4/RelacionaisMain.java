package main.java.modulo1.aula4;

public class RelacionaisMain {
    public static void main(String[] args){
//Utilizando == (igual a)
        int a = 5;
        int b = 5;
        boolean resultEqual = (a == b) ;//true

        //Utilizando != (Diferente de ! =)
        int c = 10;
        int d = 5;
        boolean resultDif = (c != d); //true (c ! = d)

        //Utilizando >= (Maior ou igual a > =)
        int e = 15;
        int f = 10;
        boolean result = (e >= f); //true (15 > = 10)
//Utilizando <= (Menor ou igual a)
        int g = 15;
        int h = 10;
        boolean result1 = (g <= h); //false (15 < = 10)

        //Utilizando > (Maior que)
        int m = 10;
        int n = 10;
        boolean result2 = (m > n); //false

        //Utilizando > (Menos que)
        int o = 9;
        int p = 10;
        boolean result3= (m < n); //true
    }
}
