package main.java.modulo2;

public class caixaMusica {
    public String cor;
    public String modelo;
    public String marca;
    public boolean tocaCDs = false;
    public boolean tocaK7s;

    public caixaMusica(){
        this("Cor 1","Modelo 1");
    }

    public caixaMusica(String cor, String modelo){
        this.cor = cor;
        this.modelo = modelo;
    }

    public caixaMusica(String cor, String modelo, String marca){
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
    }

    public void ligar(){
        System.out.println("Ligando " + marca + " " + modelo);
    }

    public void tocarCDs(){
        if (tocaCDs){System.out.println("Tocando CDs...");}
        else {System.out.println("Esse modelo não permite tocar CDs");}
    }
    public Integer bateriaRestante(){
        return 75;
    }

    public static void main(String[] args) {
    caixaMusica caixa = new caixaMusica();
    caixa.cor = "Cinza";
    caixa.modelo = "VBB-10-SLV";
    caixa.marca = "Vitrola";
    caixa.tocaCDs = false;
    caixa.tocaK7s = true;

    caixa.ligar();
    caixa.tocarCDs();
    System.out.println("Bateria restante = " + caixa.bateriaRestante() + "%");

    }
}

