package br.ada.aula4;

public class AtribuicaoMain {
    public static void main(String[] args){
        //Utilizando += (Atribuicao de adicao)
        int numero = 5;
        numero += 3; // numero = numero + 3 (resultado esperado 8)
        System.out.println("+= " + numero);

        //Utilizando =+ (Atribuicao de valor positivo)
        int numero1 = 10;
        numero1 =+ 3; //Isso é equivalente a : numero1 = +3
        System.out.println("=+ "+ numero1);
    //Utilizando /= (Atribuicao de Divisao)
        int num4 = 8;
        num4 /= 2;
        System.out.println("/= "+ num4);
    }
}
