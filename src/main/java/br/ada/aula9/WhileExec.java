package main.java.br.ada.aula9;
import java.util.Scanner;

public class WhileExec {
    public static void main(String[] args) {

        System.out.print("Digite um numero: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        scan.close();
        int it = 1;
        while(it < 11){
                System.out.println(numero + " X " + it + " = " + numero*it);
                it++;
        }
    }
}
