import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] idades = new int[5];
        int quantidade = 0;
        int opcao = -1;

        while (opcao != 0) {
            mostrarMenu();
            opcao = entrada.nextInt();

            if (opcao == 1) {
                if (quantidade < idades.length) {
                    System.out.print("Digite uma idade valida (maior que 0): ");
                    int idade = entrada.nextInt();

                    if (idade > 0) {
                        idades[quantidade] = idade;
                        quantidade++;

                        System.out.println("Idade salva!");
                    } else {
                        System.out.println("Idade invalida. Não foi salva.");
                    }
                }else {
                    System.out.println("Lista cheia! (maximo 5 idades)");
                }

                } else if (opcao == 2) {
                    listarIdades(idades, quantidade);

                } else if (opcao == 3) {
                    mostrarMedia(idades, quantidade);

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
            System.out.println("1 - Adicionar idade");
            System.out.println("2 - Listar idades");
            System.out.println("3- Mostrar média");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
        }

        static void listarIdades ( int[] idades, int quantidade){
            if (quantidade == 0) {
                System.out.println("Nenhuma idade cadastrada.");
                return;
            }
            System.out.println("Idades cadastradas:");
            for (int i = 0; i < quantidade; i++) {
                System.out.println("- " + idades[i]);
            }

        }
        static void mostrarMedia ( int[] idades, int quantidade){
            if (quantidade == 0) {
                System.out.println("Nenhuma idade cadastrada.");
                return;
            }

            int soma = 0;
            for (int i = 0; i < quantidade; i++) {
                soma += idades[i];
            }

            double media = (double) soma / quantidade;
            System.out.println("Média das idades: " + media);
        }
    }


