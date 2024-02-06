package main.java.modulo2;

import java.util.Scanner;

public class ExecMain {
    static class Disco{
        final String NOME;
        final int FAIXAS;

        Disco(String nome, int faixas) {
            this.NOME = nome;
            this.FAIXAS = faixas;
        }
    }

    static class Tocador{
        final static int ENTRADAS_CD = 3;
        final static int VOLUME_MAXIMO = 100;
        static int volumeAtual;
        static int faixaAtual;
        static int cdAtual;
        static boolean estaTocando;
        static Disco CAIXA_DE_DISCOS[];

        Tocador (){
            this.volumeAtual = 0;
            this.faixaAtual = 1;
            this.cdAtual = 0;
            this.estaTocando = false;
            CAIXA_DE_DISCOS = new Disco[ENTRADAS_CD];
        }

        static void verificarCaixaDeDiscos(){
            for (int i = 0; i < ENTRADAS_CD; i++){
                //System.out.println(CAIXA_DE_DISCOS);
                if(CAIXA_DE_DISCOS[i] == null) {
                    System.out.println("Entrada: " + i + ", sem CD incluso");
                }
                else {
                    System.out.println("Entrada: " + i + ", CD: " + CAIXA_DE_DISCOS[i].NOME + ", Faixas: " + CAIXA_DE_DISCOS[i].FAIXAS);
                }
            }
        }

        void incluirCD(Disco disco) {
            int cdsDentro = 0;
            for (int i = 0; i < ENTRADAS_CD; i++){
                if (CAIXA_DE_DISCOS[i] == null){
                    CAIXA_DE_DISCOS[i] = disco;
                    break;
                }
                else {cdsDentro++;}
                }

            if (cdsDentro == ENTRADAS_CD){
                System.out.println("O tocador está cheio. Se quiser botar outro CD, retire um primeiro.");
            }
        }


        // - Controle de volume (aumentar e diminuir)
        static void verificarVolume(){System.out.println("Volume atual = "+ volumeAtual + "/" + VOLUME_MAXIMO);;}
        static void aumentaVolume(int volume){
            volumeAtual = volumeAtual + volume;
            if(volumeAtual > 100){volumeAtual = 100;}
            System.out.println("Volume atual = " + volumeAtual + "/" + VOLUME_MAXIMO);
        }
        static void abaixaVolume(int volume){
            volumeAtual = volumeAtual - volume;
            if(volumeAtual < 0){volumeAtual = 0;}
            System.out.println("Volume atual = " + volumeAtual + "/" + VOLUME_MAXIMO);
        }

        // - Controle de faixa (tocar desde a primeira, avançar, retroceder)
        static void tocarFaixa(int entrada, int faixa) {
            if(CAIXA_DE_DISCOS[entrada] != null && faixa > 0 && faixa < CAIXA_DE_DISCOS[entrada].FAIXAS + 1 ){
                faixaAtual = faixa;
                cdAtual = entrada;
                estaTocando = true;
                System.out.println("Tocando o cd: " + CAIXA_DE_DISCOS[entrada].NOME + ", faixa " + faixaAtual);
            }
            else{
                System.out.println("A faixa selecionada não existe.");
                estaTocando = false;}
        }

        void avancarFaixa() {
            tocarFaixa(cdAtual,faixaAtual + 1);
        }

        void voltarFaixa() {
            tocarFaixa(cdAtual,faixaAtual - 1);
        }

        // - Controle de reprodução
        static void play(){
            for (int i = 0; i < ENTRADAS_CD; i++) {
                if (CAIXA_DE_DISCOS[i] != null) {
                    System.out.println("Tocando o cd: " + CAIXA_DE_DISCOS[i].NOME + ", faixa " + faixaAtual);
                    estaTocando = true;
                    break;
                } else {
                    System.out.println("Você precisa de um CD dentro do tocador.");
                    break;
                }
            }

        }

        static void pause(){
            if (estaTocando){estaTocando = false;}
        }

        static void stop(){
            estaTocando = false;
            faixaAtual = 1;
            cdAtual = 0;
        }
        void showStatus(){
            System.out.println("O tocador está tocando? " + estaTocando);
            System.out.println("Qual album ele está tocando? " + CAIXA_DE_DISCOS[cdAtual].NOME);
            System.out.println("Qual faixa ele está tocando? " + faixaAtual);
        }

        void menu(){
            //System.out.println("0 - Status do sistema");
            //showStatus();
            System.out.println("1 - Play");
            System.out.println("2 - Avançar faixa");
            System.out.println("3 - Voltar faixa");
            System.out.println("4 - Trocar de CD e faixa");
            System.out.println("5 - Pausar Player");
            System.out.println("6 - Parar Player");
            System.out.println("7 - Aumentar volume");
            System.out.println("8 - Diminuir volume");
            System.out.println("9 - Status do player");
        }
    }

    public static void main(String[] args) {

        Disco mamonas = new Disco("Mamonas Assassinas", 10);
        Disco metal = new Disco("Massacration", 7);
        //Disco nightwish = new Disco("Nightwish", 12);
        //Disco lana = new Disco("Lana Del Rey", 9);

        Tocador beatbox = new Tocador();

        beatbox.incluirCD(mamonas);
        beatbox.incluirCD(metal);
        //beatbox.incluirCD(nightwish);


        while (true){
            Scanner scan = new Scanner(System.in);
            beatbox.menu();
            System.out.print("Digite a sua escolha: ");
            try {
                Integer escolha = scan.nextInt();
                if (escolha == 0) {
                    beatbox.showStatus();
                } else if (escolha == 1) {
                    beatbox.play();
                } else if (escolha == 2) {
                    beatbox.avancarFaixa();
                } else if (escolha == 3) {
                    beatbox.voltarFaixa();
                } else if (escolha == 4) {
                    beatbox.verificarCaixaDeDiscos();
                    System.out.print("Qual CD você quer escutar? ");
                    Integer cd = scan.nextInt();
                    System.out.print("Qual faixa desse cd você quer escutar? ");
                    Integer faixa = scan.nextInt();
                    beatbox.tocarFaixa(cd, faixa);
                } else if (escolha == 5) {
                    beatbox.pause();
                } else if (escolha == 6) {
                    beatbox.stop();
                } else if (escolha == 7) {
                    System.out.print("Quanto de volume você quer aumentar? ");
                    Integer newVolume = scan.nextInt();
                    beatbox.aumentaVolume(newVolume);
                } else if (escolha == 8) {
                    System.out.print("Quanto de volume você quer aumentar? ");
                    Integer newVolume = scan.nextInt();
                    beatbox.abaixaVolume(newVolume);
                } else if (escolha == 9) {
                    beatbox.showStatus();
                } else {
                    System.out.println("Você digitou um numero fora das opções.");
                }
            }catch(Exception e){System.out.println("Por favor digite uma das opções acima.");}
            }
        }
    }


