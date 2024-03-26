package Desafios;
import java.util.Scanner;


public class Desafio01 {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Digite um numero: ");
		double numero = scanner.nextDouble();
		
		if (numero > 0 ) {
			
			System.out.println("Esse numero é Positivo ");
			
		}
		
		else if (numero < 0  ) {
			
			System.out.println("Esse numero é Negativo ");
		
			
		}
		
		else {
			
			System.out.println("Esse Numero é 0  ");
			
			scanner.close(); 
			
			
		}
		
		
		
		
	} //23/03/2024 

}
