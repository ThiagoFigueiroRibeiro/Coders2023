package main.java.modulo1.aula6;
import java.util.Scanner;
public class TempMain {

    static int newtemp(int n){
        return (n*9/5+32);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva a temperatura ");
        int temp = sc.nextInt();
        sc.close();
        System.out.println(newtemp(temp));
}
}
