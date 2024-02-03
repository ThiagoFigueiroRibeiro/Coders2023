package main.java.modulo1.aula11;
import java.util.InputMismatchException;
import java.util.Scanner;

public class numeroMain {
    public static void main(String[] args) {
        program();
    }

    public static void program() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Digite um numero: ");
            int numero = scan.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Você não digitou um numero!");
        } finally {
            System.out.println("Executando o bloco finally.");
            scan.close();
        }

    }
}