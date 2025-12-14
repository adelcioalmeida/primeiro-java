import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            mostrarMenu();
            opcao = entrada.nextInt();

            if (opcao == 1) {
                dizerOla();
            } else if (opcao == 2) {
                mostrarIdade();
            } else if (opcao == 0) {
                System.out.println("Saindo do programa...");
            } else {
                System.out.println("Opção invalida.");
            }
            System.out.println();
        }

        entrada.close();
    }

static void mostrarMenu() {
    System.out.println("MENU");
    System.out.println("1 - Dizer Olá");
    System.out.println("2 - Mostrar Idade");
    System.out.println("0 - Sair");
    System.out.print("Escolha uma opção:");
}

static void dizerOla() {
    System.out.println("Olá, Adelcio!");
}
static void mostrarIdade() {
    System.out.println("Você tem 35 anos.");

    }
}
