package main.java.modulo1.aula3;

public class WrapperClassesMain {
    public static void main(String[] args){

        //conversao de int para Integer (autoboxing)
        int numero = 10;
        Integer objNumero = Integer.valueOf(numero);

        int numero1 = 20;
        Integer objNumero1 = numero1;

        //conversao de Integer para int (unboxing)
        Integer obj = Integer.valueOf(10);
        int valor = obj.intValue();

        Integer obj1 = 10;
        int valor1 = obj;
    }
}
