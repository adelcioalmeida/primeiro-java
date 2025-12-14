import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int idade = -1;

        while (idade != 0) {
            System.out.println("Digite sua idade (0 para sair): ");
            idade = entrada.nextInt();


            if (idade > 0) {
                System.out.println("idade digitada: " + idade );
            }
        }

        System.out.println("Programa finalizado.");

        entrada.close();
    }
}
