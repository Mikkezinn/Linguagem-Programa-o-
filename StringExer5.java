package Strings;
import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Digite a nota do aluno no 1º bimestre:");
        double notaBimestre1 = scanner.nextDouble();

        System.out.println("Digite a nota do aluno no 2º bimestre:");
        double notaBimestre2 = scanner.nextDouble();

       
        System.out.println("Notas inseridas:");
        System.out.println("1º Bimestre: " + notaBimestre1);
        System.out.println("2º Bimestre: " + notaBimestre2);

        
        double mediaFinal = (notaBimestre1 + notaBimestre2) / 2;

       
        System.out.printf("Média final do aluno: %.2f\n", mediaFinal);

        scanner.close();
    }
}
