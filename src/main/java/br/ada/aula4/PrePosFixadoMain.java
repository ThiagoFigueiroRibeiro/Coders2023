package br.ada.aula4;

public class PrePosFixadoMain {
    public static void main(String[] args){
        int a = 5;
        int b = 5;

        int resultadoPrefixado = ++a; // 'a' é incrementado antes
        int resultadoPosFixado = b++; // b é incrementado depois

        System.out.println("prefixado ++a : " + resultadoPrefixado);
        System.out.println("posfixado b++ : " + resultadoPosFixado);
    }
}
