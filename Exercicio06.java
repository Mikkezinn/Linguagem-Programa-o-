package Desafios;
import java.util.Scanner;

public class Desafio06 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um numero representando um mês 1 a 12: ");
	        int mes = scanner.nextInt();

	        switch (mes) {
	            case 1:
	            case 2:
	            case 12:
	                System.out.println("Inverno ");
	                break;
	            case 3:
	            case 4:
	            case 5:
	                System.out.println("Primavera ");
	                break;
	            case 6:
	            case 7:
	            case 8:
	                System.out.println("Verão ");
	                break;
	            case 9:
	            case 10:
	            case 11:
	                System.out.println("Outono ");
	                break;
	            default:
	                System.out.println("Número inválido. ");
	        }

	        scanner.close();
	    }
	}
