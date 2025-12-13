import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        if (idade>= 18) {
            System.out.println("Você ée maior de idade");

        } else {
            System.out.println("Você é menor de idade");

        }

        teclado.close();
    }
}
