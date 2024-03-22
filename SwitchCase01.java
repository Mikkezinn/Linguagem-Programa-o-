package Aula04;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero de 1 a 7: ");
		int numero = scanner.nextInt();
		
		String diaSemana;
		
		switch (numero) {
		
		case 1:
			diaSemana = "Domingo";
			
			break;
		case 2:
			diaSemana = "Segunda";
			break;
		case 3:
		diaSemana = "Terça";
		break;
		case 4:
			diaSemana = "Quarta";
		break;
		case 5: 
			diaSemana = "Quinta";
			break;
		case 6:
			diaSemana = "Sexta";
			break;
		case 7:
			diaSemana = "Sabado";
			break;
			
		default:
		diaSemana = ("Dia invalido");
		break;
		
		
		
		}
		
		System.out.println("o numero corresponde ao dia " + diaSemana);
		scanner.close();
	}
	
	

}
