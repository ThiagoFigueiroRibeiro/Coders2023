package main.java.modulo1.aula5;
import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args){

        String name = "Doctor who";

        // PRINTLN
        System.out.println("---------- PRINTLN ----------");
        System.out.println("Hello World");
        System.out.println("Hello , " + "World");
        System.out.println("Hello, " + name);



        //PRINTF
        System.out.printf("---------- PRINTF ---------- %n");

        System.out.printf("Hello, %s", name);


        //PRINT
        System.out.println("---------- PRINT ----------");
        System.out.print("Hello Mundo!");
//PRINT
                System.out.println("---------- PRINT ----------");
        System.out.print("Hello Mundo!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o peso da primeira pessoa em kg: ");
        double peso1 = sc.nextDouble();

        System.out.println("Informe o peso da segunda pessoa em kg: ");
        double peso2 = sc.nextDouble();

        sc.close();

        final float FATOR_DE_CONVERSAO_KG_LB = 2.20462f;
        System.out.printf("peso da primeira pessoa em libras é %flb.%n", (peso1 * FATOR_DE_CONVERSAO_KG_LB));
        System.out.printf("peso da segunda pessoa em libras é %flb.%n", (peso2 * FATOR_DE_CONVERSAO_KG_LB));
    }
}
