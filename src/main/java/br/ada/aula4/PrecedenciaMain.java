package br.ada.aula4;

public class PrecedenciaMain {
    public static void main(String[] args){
        //Avaliacao de expressao aritmetica
        int resultado = 10 + 5 * 2;  // A multiplicacao (5 * 2) tem precedencia

        //Utilizando parenteses para alterar precedencia
        int resultado1 = (10 + 5) * 2; //Os parenteses alteram a ordem de avalicao

        //Uso de operadores relacionais e logicos
        boolean valor = (10 > 5) && (7 <=7); //Os operadores relacionais tem sua propria precedencia
    }
}
