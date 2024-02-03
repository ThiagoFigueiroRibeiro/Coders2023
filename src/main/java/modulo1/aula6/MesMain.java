package main.java.modulo1.aula6;
import java.util.Scanner;

public class MesMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o mês: ");
        int mes = sc.nextInt();
        sc.close();
        String tipo = (mes == 1 ) ? "Janeiro":
        (mes  == 2 ) ? "Fevereiro":
        (mes  == 3 ) ? "Março":
        (mes  == 4 ) ? "Abril":
        (mes  == 5 ) ? "Maio":
        (mes  == 6 ) ? "Junho":
        (mes  == 7 ) ? "Julho":
        (mes  == 8 ) ? "Agosto":
        (mes  == 9 ) ? "Setembro":
        (mes  == 10 ) ? "Outubro":
        (mes  == 11 ) ? "Novembro":
        (mes  == 12 ) ? "Dezembro":
        "Erro!";
        System.out.println(tipo);

    }
}
