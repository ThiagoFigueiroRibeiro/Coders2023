package main.java.modulo1.exerc.Arrays_Strings;

public class somaAlgos {
    public static int elementos(int input) {
        int soma = 0;
        int numero_atual = 0;
        int it = 0;

        if (input <= 0) {
            return -1;
        } else {
            while (it != 100) {
                numero_atual = input % 10;
                input = input / 10;
                soma = soma + numero_atual;
                it++;
            }
            return soma;
        }
    }

    public static void main(String[] args){
        int entrada = 235;
        System.out.println(elementos(entrada));
    }
}
