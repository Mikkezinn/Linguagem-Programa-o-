package Strings;

public class Exercicio1 {
	public static void main(String[] args) {
        String nomeCompleto = "Abiny Mikael Barbosa Magalhaes";
        String[] partesNome = nomeCompleto.split(" ");
        String primeiroNome = partesNome[0];
        System.out.println("Meu primeiro nome é: " + primeiroNome);
    }
}
