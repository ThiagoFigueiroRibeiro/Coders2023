package br.ada.aula4;

public class ExercicioMain {
    public static void main(String[] args){
        int idade = 40;
        String resultado = (idade < 18) ? "Juvenil": (idade < 40)? "Adulto": "Master";
        System.out.println(resultado);
    }
}
