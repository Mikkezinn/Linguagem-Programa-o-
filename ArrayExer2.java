package Arrays;
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomesAlunos = new String[3];
        double[][] notasAlunos = new double[3][2]; 

       
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            nomesAlunos[i] = scanner.nextLine();

            System.out.println("Digite a nota do aluno " + nomesAlunos[i] + " no 1º bimestre:");
            notasAlunos[i][0] = scanner.nextDouble();

            System.out.println("Digite a nota do aluno " + nomesAlunos[i] + " no 2º bimestre:");
            notasAlunos[i][1] = scanner.nextDouble();

           
            scanner.nextLine();
        }

   
        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < 3; i++) {
            double media = (notasAlunos[i][0] + notasAlunos[i][1]) / 2;
            System.out.println("Aluno: " + nomesAlunos[i] + " - Média: " + media);
        }

        scanner.close();
    }
}
