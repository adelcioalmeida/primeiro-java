import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {
            mostrarMenu();
            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {
                adicionarPessoa(entrada,pessoas);

                } else if (opcao == 2) {
                    listarPessoas(pessoas);

                } else if (opcao == 3) {
                    mostrarMediaIdades(pessoas);

                } else if (opcao == 0) {
                    System.out.println("Saindo...");

                } else {
                    System.out.println("Opção invalida.");

                }
                System.out.println();
            }

            entrada.close();
        }

        static void mostrarMenu () {
            System.out.println("MENU");
            System.out.println("1 - Adicionar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("3- Mostrar média das idades");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
        }

        static void adicionarPessoa ( Scanner entrada, ArrayList<Pessoa> pessoas){
            System.out.print("Digite o nome");
            String nome = entrada.nextLine();

            System.out.print("Digite a idade (maior que 0):");
            int idade = entrada.nextInt();
            entrada.nextLine();

            if (idade > 0 && !nome.isBlank()) {
                pessoas.add(new Pessoa(nome, idade));
                System.out.println("Pessoa salva!");
            } else {
                System.out.println("Dados inválidos. Não fo i salvo.");
            }

        }
        static void listarPessoas(ArrayList<Pessoa> pessoas) {
            if (pessoas.isEmpty()) {
                System.out.println("Nenhuma pessoa cadastrada.");
                return;
            }

            System.out.println("Pessoas cadastradas:");
            for (Pessoa p : pessoas) {
                System.out.println("- " + p.getNome() + " | idade: " + p.getIdade());
            }
        }

        static void mostrarMediaIdades(ArrayList<Pessoa> pessoas){
            if (pessoas.isEmpty()) {
                System.out.println("Nenhuma pessoa cadastrada.");
                return;

            }
                int soma = 0;
            for (Pessoa p : pessoas) {
                soma += p.getIdade();
            }

            double media = (double) soma / pessoas.size();
            System.out.println("Média das idades: " + media);
        }
    }


