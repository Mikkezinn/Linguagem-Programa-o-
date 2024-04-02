package Strings;

public class Exercicio7 {
    public static void main(String[] args) {
        
        String minhaString = " teste 123 ";    
        System.out.println("a) String original: \"" + minhaString + "\"");

        
        String semEspacosInicioFim = minhaString.trim();
        System.out.println("b) String sem espaços no início e no final: \"" + semEspacosInicioFim + "\"");

        
        String[] palavras = semEspacosInicioFim.split("\\s+");
        String stringComUmEspaco = String.join(" ", palavras);
        System.out.println("c) String com apenas 1 espaço entre as 2 palavras: \"" + stringComUmEspaco + "\"");
    }
}
