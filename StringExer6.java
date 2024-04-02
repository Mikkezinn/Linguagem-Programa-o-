package Strings;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite a primeira string:");
        String string1 = scanner.nextLine();

        System.out.println("Digite a segunda string:");
        String string2 = scanner.nextLine();

        System.out.println("Digite a terceira string:");
        String string3 = scanner.nextLine();

        
        String maiorString = string1;
        if (string2.length() > maiorString.length()) {
            maiorString = string2;
        }
        if (string3.length() > maiorString.length()) {
            maiorString = string3;
        }

        
        System.out.println("A maior string é: " + maiorString);

        scanner.close();
    }
}
