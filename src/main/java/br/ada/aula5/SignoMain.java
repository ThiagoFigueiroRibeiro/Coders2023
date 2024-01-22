package main.java.br.ada.aula5;

import java.util.Scanner;

public class SignoMain {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Coloque o dia de nascimento ");
        int dia = sc1.nextInt();

        System.out.println("Coloque o mes de nascimento ");
        int mes = sc1.nextInt();

        int total = 30*mes+dia;
        String tipo = (total >= 80 && total < 110 ) ? "Áries":
                (total >= 110 && total < 140 ) ? "Touro":
                (total >= 140 && total < 170 ) ? "Gemeos":
                (total >= 170 && total < 200 ) ? "Cancer":
                (total >= 230 && total < 260 ) ? "Leao":
                (total >= 260 && total < 290 ) ? "Virgem":
                (total >= 290 && total < 320 ) ? "Libra": "Fora do range";
        System.out.println(tipo);
    }
}
