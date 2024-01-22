package main.java.br.ada.aula5;
import java.util.Scanner;

public class DiaMain {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Coloque um dia da semana ");
        int dia = sc1.nextInt();
        String tipo = (dia == 1) ? "Domingo":
                        (dia == 2) ? "Segunda":
                        (dia == 3) ? "Terça":
                        (dia == 4) ? "Quarta":
                        (dia == 5) ? "Quinta":
                        (dia == 6) ? "Sexta":
                        (dia == 7) ? "Sábado": "erro";
        System.out.println(tipo);
    }
}
