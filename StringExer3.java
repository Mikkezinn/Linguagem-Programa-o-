package Strings;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome de uma cidade:");
        String nomeCidade = scanner.nextLine();

        if (nomeCidade.equalsIgnoreCase("Curitiba")) {
            System.out.println("Você digitou Curitiba!");
        } else {
            System.out.println("Você não digitou Curitiba.");
        }

        scanner.close();
    }
}
