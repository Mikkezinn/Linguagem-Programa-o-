package Desafios;
import java.util.Scanner;


public class Desafio03 {
   public static void main (String [] args) {
	   
	   Scanner scanner = new Scanner(System.in);

       System.out.print("Digite um número que resente um dia da semana 1 a 7: ");
       int dia = scanner.nextInt();

       switch (dia) {
           case 1:
           case 2:
           case 3:
           case 4:
           case 5:
               System.out.println("Dia útil.");
               break;
           case 6:
           case 7:
               System.out.println("Final de semana.");
               break;
           default:
               System.out.println("Desculpe, esse número é inválido. Digite um número entre 1 e 7.");
	   
   }
       
       scanner.close();
   }
	
}
