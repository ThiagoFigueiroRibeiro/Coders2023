package main.java.modulo2;

public class tocarMusica {
        public static void main(String[] args) {
    caixaMusica caixa = new caixaMusica("Cinza", "Modelo");
    caixa.cor = "Cinza";
    //caixa.modelo = "VBB-10-SLV";
    caixa.marca = "Vitrola";
    caixa.tocaCDs = false;
    caixa.tocaK7s = true;

    caixa.ligar();
    caixa.tocarCDs();
    System.out.println("Bateria restante = " + caixa.bateriaRestante() + "%");

    }
}

