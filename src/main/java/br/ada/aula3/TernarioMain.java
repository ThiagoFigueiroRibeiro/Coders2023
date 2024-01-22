package br.ada.aula3;

public class TernarioMain {
    public static void main(String[] args){
        int a = 11, b = 12, c = 3;
        int result = (a>b) ? a:b;
        result = (result>c)? result:c;
        System.out.println(result);
    }
}
