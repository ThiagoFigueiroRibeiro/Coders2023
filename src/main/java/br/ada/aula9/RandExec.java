package main.java.br.ada.aula9;
import java.util.Random;
import java.util.Scanner;

public class RandExec {
    public static void main(String[] args) {

        Random random = new Random();
        int numero_gerado = random.nextInt(10)+1;
        int numero_recebido = -1;

        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("Digite um numero: ");
            numero_recebido = scan.nextInt();

            if(numero_recebido < numero_gerado) {
                System.out.println("O número gerado é maior...");
            }else if(numero_recebido > numero_gerado){
                System.out.println("O número gerado é menor...");
            }
        }while(numero_gerado != numero_recebido);
        scan.close();
        System.out.println("Você acertou! O número gerado aleatoriamente foi o " + numero_gerado +"!");
    }
}
