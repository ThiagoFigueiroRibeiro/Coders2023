package main.java.br.ada.aula6;
import java.util.Scanner;

public class EnumMain {
    public enum MyEnum {
        JAN(31),
        FEV(28),
        MAR(31);

        private final int intValue;

        MyEnum(int intValue) {
            this.intValue = intValue;
        }

        public int getIntValue() {
            return intValue;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o mês: ");
        int mes = sc.nextInt();
        System.out.println("Insira o ano: ");
        int ano = sc.nextInt();
        sc.close();

}
}
