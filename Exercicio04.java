package Desafios;
import java.util.Scanner;


public class Desafio04 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        
        if (numero < 0) {
            System.out.println("Número inválido. ");
        } else  {
            int fatorial = 1;
            int contador = 1;

            while (contador <= numero) {
                fatorial *= contador; 
                contador++; 
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }
}
