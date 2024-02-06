package main.java.modulo2;

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
            cdAtual = 1;
        }
        void showStatus(){
            System.out.println("O tocador está tocando? " + estaTocando);
            System.out.println("Qual album ele está tocando? " + CAIXA_DE_DISCOS[cdAtual].NOME);
            System.out.println("Qual faixa ele está tocando? " + faixaAtual);
        }
    }

    public static void main(String[] args) {
        Disco mamonas = new Disco("Mamonas Assassinas", 10);
        Disco metal = new Disco("Massacration", 7);
        Disco nightwish = new Disco("Nightwish", 12);
        Disco lana = new Disco("Lana Del Rey", 9);

        Tocador beatbox = new Tocador();
        beatbox.verificarCaixaDeDiscos();
        beatbox.play();

        beatbox.incluirCD(mamonas);
        beatbox.incluirCD(metal);
        beatbox.incluirCD(nightwish);
        beatbox.incluirCD(lana);
        beatbox.verificarCaixaDeDiscos();

        //beatbox.verificarVolume();
        //beatbox.aumentaVolume(15);
        //beatbox.aumentaVolume(150);
        //beatbox.abaixaVolume(50);
        //beatbox.abaixaVolume(100);
        //beatbox.verificarVolume();

        beatbox.tocarFaixa(1,2);
        //beatbox.avancarFaixa();
        beatbox.voltarFaixa();
        beatbox.showStatus();
    }

}
