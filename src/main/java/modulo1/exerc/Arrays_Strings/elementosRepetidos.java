package main.java.modulo1.exerc.Arrays_Strings;

public class elementosRepetidos {
    public static boolean elementos(double[] input) {
        boolean resposta = false;
        for (int i = 0; i < input.length-1; i++) {
            double numero_atual = input[i];

            for (int j = i+1; j < input.length-1; j++) {
                double numero_iteracao = input[j];
                if(numero_atual == numero_iteracao){
                    return(true);
                }
            }
        }
        return resposta;
    }

    public static void main(String[] args){
        double[] entrada = {2.5, 3.2, 4.5, 5, 6};
        elementos(entrada);
    }
}
