package radioteste;
import java.util.Scanner;
public class Radio {
private boolean ligado;
private int volume;

public Radio() {
	
	this.ligado = false;
	this.volume = 50; //inicializa o radio em 50% de volume
}
	public void ligar() {
		this.ligado = true;
		System.out.println("O radio esta ligado");
		}
	public void aumentarVolume() {
		if (ligado) {
			if(volume < 100) {
				volume = 100; //limite maximo do volume
			}
			System.out.println("Volume aumentado" + volume + "%");
					
	}else {
		System.out.println("o volume esta no maximo");
	}
	}else{
					System.out.println("Ligue o radio para ajustar o volume");
	}



public static void main (String[] args) {
	
Radio radio = new Radio ();
Scanner scanner = new Scanner(System.in);

for(;;) {
	System.out.println("\nMENU:");
	System.out.println("1 - Ligar Radio");
	System.out.println("2 - Desligar Radio");
	System.out.println("3 - Aumentar Volume");
	System.out.println("4 - Diminuir Volume"");
	System.out.println("5 - Sair do programa");
	System.out.println("Escolha uma opção");
}

}
}
