package Desafios;
import java.util.Scanner;

public class Desafio07 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        int numeroSecreto = (int) (Math.random() * 100) + 1;
	        int tentativas = 0;
	        int palpite;

	        System.out.println("Duvido tu adivinhar o número ");

	        do {
	            System.out.print("Qual tu acha que é: ");
	            palpite = scanner.nextInt();
	            tentativas++;

	            if (palpite < numeroSecreto) {
	                System.out.println("o número é maior Jovem");
	            } else if (palpite > numeroSecreto) {
	                System.out.println("o número é menor Jovem");
	            }
	        } while (palpite != numeroSecreto);

	        System.out.println("Boa irmaozinho(a) voce acertouuu é issoo aiiii " + numeroSecreto + " em " + tentativas + " tentativas.");

	        scanner.close();
	    }
	}

