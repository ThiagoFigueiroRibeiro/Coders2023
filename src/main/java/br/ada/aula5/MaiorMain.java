package main.java.br.ada.aula5;

import java.util.Scanner;

public class MaiorMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro numero");
        int N1 = sc.nextInt();

        System.out.println("Insira o segundo numero");
        int N2 = sc.nextInt();

        System.out.println("Insira o terceiro numero");
        int N3 = sc.nextInt();
        sc.close();

        int maior = (N1 > N2 && N1 > N3)? N1:
                    (N2 > N1 && N2 > N3)? N2:
                    (N3 > N2 && N3 > N1)? N3: -1;

        System.out.println("O maior numero é " + maior);

    }
}
