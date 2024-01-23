package main.java.br.ada.exerc.Arrays_Strings;

public class NunUnic {
    public static int elementos(int[] input) {

        for (int i = 0; i < input.length-1; i++) {
            boolean eUnico = true;
            double numero_atual = input[i];

            for (int j = i+1; j < input.length; j++) {
                double numero_iteracao = input[j];
                if (numero_atual == numero_iteracao) {
                    eUnico = false;
                    break;
                }
            }
            if (eUnico) {
                return input[i];
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] entrada = {1,2,2,5,5,5,4,4,10,10};
        System.out.println(elementos(entrada));
    }
}
