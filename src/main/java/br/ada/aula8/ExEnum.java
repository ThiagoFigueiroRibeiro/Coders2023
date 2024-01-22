package main.java.br.ada.aula8;

public class ExEnum {

    public static void main(String[] args) {
        System.out.println(Planeta.MARTE.getMassa());
    }

    public enum Planeta {
        MERCURIO(3.303e+23, 2.4397e6),
        VENUS(4.869e+24, 6.0518e6),
        TERRA(5.976e+24, 6.37814e6),
        MARTE(  6.421e+23, 3.3972e6);

        private final double massa; // em kg
        private final double raio; // em metros

        // Construtor privado para inicializar os campos
        Planeta(double massa, double raio) {
            this.massa = massa;
            this.raio = raio;
        }
        // Métodos para obter massa, raio e calcular gravidade superficial
        public double getMassa() {
            return massa;
        }

        public double getRaio() {
            return raio;
        }

        public double calcularGravidadeSuperficial() {
            return (massa / (raio * raio)) * 6.67430e-11;
        }
    }
}
