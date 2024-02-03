package main.java.modulo1.aula8;

public class TempConverter {

    public static void main(String[] args) {
        double temp = 00;
        System.out.println(Conversao.CK.getConv(temp));
        System.out.println(Conversao.CF.getConv(temp));
        System.out.println(Conversao.KC.getConv(temp));
        System.out.println(Conversao.KF.getConv(temp));
        System.out.println(Conversao.FC.getConv(temp));
        System.out.println(Conversao.FK.getConv(temp));
    }

    public enum Conversao {
        CK(273, 1),
        CF(+17.77, 5.0/9.0),
        KC(-273, 1),
        KF(-255.37, 5.0/9.0),
        FC(-32, 9.0/5.0),
        FK(+459.67, 9.0/5.0);

        private final double calculo;
        private final double div;

        Conversao(double calculo, double div) {
            this.calculo = calculo;
            this.div = div;
        }

        public double getConv(double temp) {
            return (temp+calculo)/div;
        }
    }
}
