package EXERCICIO;

public class RADIO {

	private int volume;
    private boolean ligado;

    public RADIO() {
        this.volume = 50; 
        this.ligado = false;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("O Radio está ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("O Radio está desligado.");
    }

    public void aumentarVolume() {
        if (this.ligado) {
            if (this.volume < 100) {
                this.volume++;
                System.out.println("Volume aumentado para " + this.volume + "%.");
            } else {
                System.out.println("Volume já está no máximo (100%).");
            }
        } else {
            System.out.println("O rádio está desligado.");
        }
    }

    public void diminuirVolume() {
        if (this.ligado) {
            if (this.volume > 1) {
                this.volume--;
                System.out.println("Volume diminuído para " + this.volume + "%.");
            } else {
                System.out.println("Volume já está no mínimo (1%).");
            }
        } else {
            System.out.println("O rádio está desligado.");
        }
    }

    public static void main(String[] args) {
        RADIO radio = new RADIO();
        radio.ligar();
        radio.aumentarVolume();
        radio.diminuirVolume();
        radio.aumentarVolume();
        radio.aumentarVolume();
        radio.desligar();
    }
}

