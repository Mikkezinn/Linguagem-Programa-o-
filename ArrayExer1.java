package Arrays;

public class Exercicio1 {
	public static void main(String[] args) {
       
        int[] numeros = {10, 20, 30, 40, 50};

        
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        
        System.out.println("A soma de todos os elementos do array é: " + soma);
    }
}
