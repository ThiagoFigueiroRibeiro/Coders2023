package main.java.modulo1.exerc.Arrays_Strings;

import java.util.Scanner;

public class charUniMain {
    public static int primeiroCaractereUnico(String input) {
        for (int i = 0; i < input.length(); i++) {
            char character_atual = input.charAt(i);
            boolean eUnico = true;

            for (int j = 0; j < input.length(); j++) {
                if (i != j) {
                    char character_iter = input.charAt(j);
                    if (character_atual == character_iter) {
                        eUnico = false;
                        break;
                    }
                }
            }

            if (eUnico) {
                System.out.println(i);
                return i;
            }
        }

        return -1; // Retorna -1 se não houver caractere único na palavra
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("A string: ");
        String input = sc.nextLine();
        primeiroCaractereUnico(input);
    }

}