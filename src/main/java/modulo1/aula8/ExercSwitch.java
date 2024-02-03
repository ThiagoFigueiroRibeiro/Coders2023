package main.java.modulo1.aula8;
import java.util.Scanner;

public class ExercSwitch {
    static void err(){
        System.out.println("Você escreveu uma operação errada");
    }
    static double DivZero(double a, double b){
        if (b==0){
        System.out.println("Você não pode ter uma divisão por Zero");
        return 0;}
        else {System.out.println(a/b);return 0;}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual operação você deseja? (Soma, Sub, Multi, Div)");
        String comando = sc.next();

        System.out.println("Qual é o primeiro número?");
        double a = sc.nextInt();

        System.out.println("Qual é o segundo número?");
        double b = sc.nextInt();
        sc.close();
        double resultado;
        switch (comando) {
            default -> err();
            case "Soma" -> System.out.println(a+b);
            case "Sub" ->  System.out.println(a-b);
            case "Multi" ->  System.out.println(a*b);
            case "Div" -> DivZero(a,b);}
        }
    }

