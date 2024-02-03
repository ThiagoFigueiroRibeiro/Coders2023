package main.java.modulo1.exerc.Arrays_Strings;

public class soletracaoMain {
    public static String[] elementos(String input) {
        String[] palavra = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            palavra[i] = String.valueOf(input.charAt(i));
        }
        return palavra;
    }

    public static void main(String[] args){
        String entrada = "amor";
        System.out.println(elementos(entrada));
    }
}
