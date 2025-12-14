import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int opcao  = -1;

        while (opcao != 0) {
            System.out.println("MENU");
            System.out.println("1 - Dizer olá");
            System.out.println("2 - Mostrar idade");
            System.out.println("Escolha uma opção: ");

            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("Olá, Adelcio!");
            } else if (opcao == 2) {
                System.out.println("Você tem 35 anos.");
            } else if (opcao == 0) {
                System.out.println("Saindo do programa...");
            } else {
                System.out.println("Opção invalida.");
            }
            System.out.println();
        }

        entrada.close();
    }
}
