package main.java.br.ada.exerc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class agendaMainPhi {
    public static void main(String[] args) {
        program();
    }

    public static class Contato {
        private Long id;
        private String nome;
        private String sobreNome;
        private long telefones;

        public Contato(Long id, String nome, String sobreNome, long telefones) {
            this.id = id;
            this.nome = nome;
            this.sobreNome = sobreNome;
            this.telefones = telefones;
        }
        public Long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

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
            for (Contato contato : contatos) {
                contato.printContato();
            }
            System.out.println();
        }
    }

    public class Telefone {
        private Long id;
        private String ddd;
        private Long numero;
    }

    static void adicionarContato(List<Contato> contatos, long id) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o nome do usuário: ");
        String nome = sc.nextLine();
        System.out.print("Escreva o sobrenome do usuário: ");
        String sobrenome = sc.nextLine();
        System.out.print("Escreva o telefone do usuário: ");
        Long telefone = sc.nextLong();
        contatos.add(new Contato(id, nome, sobrenome, telefone));
        Contato.printAllContacts(contatos);
    }

    static void removerContato(List<Contato> contatos, long id) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o ID do usuário que você deseja deletar: ");
        Long myId = sc.nextLong();
        contatos.removeIf(contato -> contato.getId().equals(myId));
        Contato.printAllContacts(contatos);
    }

    static void editarContato(List<Contato> contatos, long id) {
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
                contato.setTelefone(novoTelefone);

                System.out.println("Contato editado com sucesso!");
                Contato.printAllContacts(contatos);
                return; // Exit the method after editing the contact
            }
        }
        Contato.printAllContacts(contatos);
    }

    static void sair() {
        System.out.println("Você escolheu a opção 4. Você está saindo do programa. Até mais!");
        System.exit(0);
    }

    static void defOption() {
        System.out.println("Escolha outra opção.");
    }


    public static void program() {
        Scanner scan = new Scanner(System.in);
        int opcao;
        List<Contato> contatos = new ArrayList<>();
        long id = 0;

        while (true) {
            System.out.println("1 - Adicionar contato, 2 - Remover contato, 3 - Editar contato, 4 - Sair");
            System.out.print("Digite uma opção: ");

            try {
                opcao = scan.nextInt();
                switch (opcao) {
                    case 1:
                        adicionarContato(contatos, id);
                        id++;
                        break;
                    case 2:
                        removerContato(contatos,id);
                        break;
                    case 3:
                        editarContato(contatos,id);
                        break;
                    case 4:
                        sair();
                        break;
                    default:
                        defOption();
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número.");
                scan.nextLine(); // Consume the invalid input
            }
        }
    }
}