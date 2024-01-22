package main.java.br.ada.aula4;

public class BissextoMain{
public static void main(String[] args){
        int ano = 1004;
        String resultado = ( (ano % 4 == 0 && ano % 100 != 100) || (ano % 400 == 0) ) ? "Bissexto": "Não Bissexto";
        System.out.println(resultado);
    }
}


