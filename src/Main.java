import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> idades = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {
            mostrarMenu();
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.print("Digite uma idade valida (maior que 0): ");
                    int idade = entrada.nextInt();

                    if (idade > 0) {
                        idades.add(idade);
                        System.out.println("Idade salva!");
                    } else {
                        System.out.println("Idade invalida.");
                    }

                } else if (opcao == 2) {
                    listarIdades(idades);

                } else if (opcao == 3) {
                    mostrarMedia(idades);

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

        static void listarIdades ( ArrayList<Integer> idades){
            if (idades.isEmpty()) {
                System.out.println("Nenhuma idade cadastrada.");
                return;
            }
            System.out.println("Idades cadastradas:");
            for (int idade : idades) {
                System.out.println("- " + idade);
            }

        }
        static void mostrarMedia (ArrayList<Integer> idades ){
            if (idades.isEmpty()) {
                System.out.println("Nenhuma idade cadastrada.");
                return;
            }

            int soma = 0;
            for (int idade : idades) {
                soma += idade;
            }

            double media = (double) soma / idades.size();
            System.out.println("Média das idades: " + media);
        }
    }


