// Projeto Agenda de Contatos - Santander Coders 2023.2
// Autor: Thiago Figueiró Ribeiro
//
//
// O código abaixo simula uma agenda de contato eletrónica.
// Nele podemos adicionar contatos, editar contatos, remover contatos,
// e ao sair da agenda, esses contatos são exportados para um
// arquivo "agenda.txt".
//
// O código está estruturado da seguinte forma:
// * Importação de classes necessárias pra execução do código
// * Criação da classe principal do código.
// * * Inicialização do código
// * * Criação da classe Contato.
// * * * Criação dos métodos da classe Contato.
// * * Criação das funções do código.

// * Importação de classes necessárias pra execução do código * //

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// * Criação da classe principal do código.
public class agendaMainPhi {

    // * * Inicialização do código
    public static void main(String[] args) {
        program();
    }
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    // * * Criação da classe Contato.
    public static class Contato {
        private final Long id;
        private String nome;
        private String sobreNome;
        private long telefones;

        public Contato(Long id, String nome, String sobreNome, long telefones) {
            this.id = id;
            this.nome = nome;
            this.sobreNome = sobreNome;
            this.telefones = telefones;
        }

        // * * * Criação dos métodos da classe Contato.
        public Long getId() {
            return id;
        }

        // ATENÇÃO: O método abaixo está em comentário já que
        // a geração de ID é feita de forma dentro do program();
        //
        //public void setId(long id) {
        //    this.id = id;
        //}

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSobrenome() {
            return sobreNome;
        }

        public void setSobrenome(String sobreNome) {
            this.sobreNome = sobreNome;
        }

        public Long getTelefone() {
            return telefones;
        }

        public void setTelefone(Long telefones) {
            this.telefones = telefones;
        }

        public void printContato() {
            System.out.println(id + " | " + nome + " " + sobreNome + " | " + telefones);
        }

        public static void printAllContacts(List<Contato> contatos) {
            System.out.println();
            System.out.println(">>>> Contatos <<<<");
            System.out.println("Id | Nome e Sobrenome | Telefone" );
            for (Contato contato : contatos) {
                contato.printContato();
            }
            System.out.println();
        }

    }

    // * * Criação das funções do código.
    public static void program() {
        Scanner scan = new Scanner(System.in);
        int opcao;
        List<Contato> contatos = new ArrayList<>();
        long id = 0;

        while (true) {
            exibirMenu();
            try {
                opcao = scan.nextInt();
                switch (opcao) {
                    case 1:
                        adicionarContato(contatos, id);
                        id++;
                        break;
                    case 2:
                        removerContato(contatos);
                        break;
                    case 3:
                        editarContato(contatos);
                        break;
                    case 4:
                        sair(contatos);
                        break;
                    default:
                        defOption();
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println(ANSI_YELLOW + "Entrada inválida. Digite um número." + ANSI_RESET);
                scan.nextLine();
            } catch (FileNotFoundException e) {
                System.out.println(ANSI_YELLOW + "Aconteceu algo de errado..." + ANSI_RESET);
            }
        }
    }

    static void exibirMenu() {
        System.out.println(">>>> Menu <<<<");
        System.out.println("1 - Adicionar contato ");
        System.out.println("2 - Remover contato ");
        System.out.println("3 - Editar contato ");
        System.out.println("4 - Sair");
        System.out.print("Digite uma opção: ");
    }

    static void adicionarContato(List<Contato> contatos, long id) {
        boolean jaCadastrado = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o nome do usuário: ");
        String nome = sc.nextLine();
        System.out.print("Escreva o sobrenome do usuário: ");
        String sobrenome = sc.nextLine();
        System.out.print("Escreva o telefone do usuário: ");
        Long telefone = sc.nextLong();

        for(Contato i: contatos){
            if(i.telefones == telefone){
                jaCadastrado = true;
                break;
            }
        }

        if(jaCadastrado){
            telJaCadastrado();
        }
        else {
            contatos.add(new Contato(id, nome, sobrenome, telefone));

        }
        Contato.printAllContacts(contatos);
    }

    static void removerContato(List<Contato> contatos) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o ID do usuário que você deseja deletar: ");
        Long myId = sc.nextLong();
        contatos.removeIf(contato -> contato.getId().equals(myId));
        Contato.printAllContacts(contatos);
    }

    static void editarContato(List<Contato> contatos) {
        boolean jaCadastrado = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o ID do usuário que você deseja editar: ");
        Long myId = sc.nextLong();
        for (Contato contato : contatos) {
            if (contato.getId().equals(myId)) {
                System.out.print("Novo nome: ");
                String novoNome = sc.next();
                contato.setNome(novoNome);

                System.out.print("Novo sobrenome: ");
                String novoSobrenome = sc.next();
                contato.setSobrenome(novoSobrenome);

                System.out.print("Novo Telefone: ");
                Long novoTelefone = sc.nextLong();

                for(Contato i: contatos){
                    if(i.telefones == novoTelefone){
                        jaCadastrado = true;
                        break;
                    }
                }

                if(jaCadastrado){
                    telJaCadastrado();
                }
                else {
                    contato.setTelefone(novoTelefone);
                    System.out.println("Contato editado com sucesso!");
                }
                Contato.printAllContacts(contatos);
                return;
            }
        }
        Contato.printAllContacts(contatos);
    }

    static void sair(List<Contato> contatos) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("agenda.txt");
        out.println("Id | Nome e Sobrenome | Telefone" );
        for (Contato contato : contatos) {
            out.println(contato.getId() + " | " + contato.getNome() + " " + contato.getSobrenome() + " | " + contato.getTelefone());
        }
        out.close();
        System.out.println("Você escolheu a opção 4. Você está saindo do programa. Até mais!");
        System.exit(0);
    }

    public static void telJaCadastrado(){
        System.out.println(ANSI_YELLOW + "ATENÇÃO! Operação cancelada - Telefone já cadastrado." + ANSI_RESET);
    }

    static void defOption() {
        System.out.println(ANSI_YELLOW + "Você escreveu um numero fora das opções. Escolha outra opção." + ANSI_RESET);
    }

}