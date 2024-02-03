package main.java.modulo1.aula8;

public class Exerc2 {

    public static void main(String[] args) {
        System.out.println(CategoriaProduto.ELETRONICO.getMensagem());
    }

    public enum CategoriaProduto {
        ELETRONICO("Você escolheu a categoria Eletrônico"),
        VESTUARIO("Você escolheu a categoria Vestuario"),
        ALIMENTO("Você escolheu a categoria Alimento");

        private final String mensagem;

        CategoriaProduto(String mensagem) {
            this.mensagem = mensagem;
        }

        public String getMensagem() {
            return mensagem;
        }
    }
}
