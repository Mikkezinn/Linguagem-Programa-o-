package aula04;
import java.util.Scanner;

public class Else02 {
	public static void main (String [] args) {
		   
		   Scanner scanner = new Scanner(System.in);
		   System.out.print("Digite a nota: ");
		   int nota = scanner.nextInt();
		   
		   if(nota >= 90) {
				System.out.println("Parabéns Voce foi Aprovado com 90 pontos");
			
		   
	   } else {
		   if (nota >= 70) {
			   System.out.println("Aprovado");
		   }   
		   else {
			   System.out.println("Reprovado");
		   }
		   scanner.close();
	}  
	}
}   
	
