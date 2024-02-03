package main.java.modulo1.aula11;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class trycatchMain {
    public static void main(String[] args) throws IOException {
        program();
    }

    public static void program() throws IOException {
        BufferedReader Reader = null;
        try {
            Reader = new BufferedReader(new FileReader("Agenda.txt"));
        }
        catch (IOException e) {
            System.out.println("Erro: Arquivo não existe");
        }
        finally{
            System.out.println("Linha finally rodando");
            Reader.close();
        }

    }
}