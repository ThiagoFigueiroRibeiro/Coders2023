package br.ada.aula3;

public class VariableMain {
    public static void main(String[] args){
        //declarando variavel inteira

        int idade = 20;
        int idade2;
        idade2 = 30;

        //declando variavel em linha
        int idade1, idade3, idade4;
        idade1 = 10;
        idade3 = 15;
        idade4 = 40;

        int numero = 1, numero2 = 2, numero3 =3;

        //declaracao da variavel constante
        final char genero;
        genero = 'M';

        final char genero1 = 'F';
        enum GeneroDeFilme{
            TERROR("horror"),
            ROMANCE("romance1"),
            DRAMA("drama1"),
            COMEDIA("comedy");

            private final String english;
            GeneroDeFilme(String horror) {
                this.english = horror;
            }

            public String getGeneroFilmeInEnglish() {
                return english;
            }

        }
//declaracao variavel enum
        String filme = GeneroDeFilme.DRAMA.name();
        String generoInEnglish = GeneroDeFilme.ROMANCE.getGeneroFilmeInEnglish();

        System.out.println("Genero filme em pt-br: " + filme);
        System.out.println("Genero filme em : " + generoInEnglish);
    }
}
