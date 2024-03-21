package aula04;
import java.util.Scanner;

public class Desafio {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome da pessoa: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite o signo de " + nome + ": ");
		String signo = scanner.nextLine();
		
	    System.out.print("Digite a idade de " + nome + ": " + signo + ": ");
	    int idade = scanner.nextInt();
	    
	    System.out.println(nome + " signo de " + signo + " tem " + idade + ": ");
	    scanner.close();
	    
	    
		
	}

}
