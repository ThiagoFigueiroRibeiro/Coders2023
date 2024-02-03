package main.java.modulo1.aula9;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class PrimosExec {
    public static void main(String[] args) {

        System.out.print("Digite um numero: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        scan.close();
        int it = numero;
        boolean IsPrimo = true;
        while(sqrt(numero) < it){
            it--;
            if (numero % it == 0){IsPrimo = false;}
        }

        if(IsPrimo && it != 2){System.out.print(numero + " é primo.");}
            else{System.out.print(numero + " Não é primo");}
    }
}
