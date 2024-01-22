import java.util.Scanner;
public class ConvMain {
    static double cambio(double n){
        return (n*4.86);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos dolares (USD $) você tem? ");
        int reais = sc.nextInt();
        sc.close();
        System.out.println(reais + " Dolares nos dão R$ " + cambio(reais));
    }
}
