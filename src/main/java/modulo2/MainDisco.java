package main.java.modulo2;

public class MainDisco {
    public static class Disco {
        private String nomeDoDisco;
        private int numeroDeFaixas;

        Disco(String nome, int faixas) {
            this.nomeDoDisco = nome;
            this.numeroDeFaixas = faixas;
        }
    }
    public static class Tocador {
        private static boolean cdCarregado = false;
        private static Disco discoInserido = null;

        public static void carregarDisco(Disco disco) {
            if (cdCarregado)
                System.out.println("Já tem um CD carregado. Retire ele primeiro.");
            else {
                discoInserido = disco;
                System.out.println("Carregando o CD " + discoInserido.nomeDoDisco);
                cdCarregado = true;
            }
        }

        public static void retirarDisco() {
            if (cdCarregado) {
                System.out.println("Retirando o CD...");
                discoInserido = null;
                cdCarregado = false;
            } else {
                System.out.println("Não existe CD carregado.");
            }
            ;
        }

        public static void tocarCD() {
            if (cdCarregado) {
                System.out.println("Tocando o CD " + discoInserido.nomeDoDisco + ", ele tem " + discoInserido.numeroDeFaixas + " faixas.");
            } else {
                System.out.println("Não existe CD no tocador.");
            }
        }
    }

    public static void main(String[] args) {
        Disco mamonas = new Disco("Mamonas", 12);
        Tocador.carregarDisco(mamonas);
        Tocador.tocarCD();

        Disco guns = new Disco("Guns", 15);
        Tocador.carregarDisco(guns);
        Tocador.tocarCD();

        Tocador.retirarDisco();
        Tocador.carregarDisco(guns);
        Tocador.tocarCD();

        Tocador.retirarDisco();
        Tocador.tocarCD();
    }
}

