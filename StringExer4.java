package Strings;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome de uma cidade:");
        String nomeCidade = scanner.nextLine();

        if (nomeCidade.toLowerCase().equals("curitiba")) {
            System.out.println("Você digitou Curitiba!");
        } else {
            System.out.println("Você não digitou Curitiba.");
        }

        scanner.close();
    }
}
