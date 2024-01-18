public class SmartTV {
    public boolean ligada;
    public int canal;
    public int volume;

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void aumentarVolume() {
        this.volume++;
    }

    public void diminuirVolume() {
        this.volume--;
    }

    public void mudarCanal() {
        this.canal++;
    }

    public void mudarCanal(int canal) {
        this.canal = canal;
    }

    public static void main(String[] args) {
        System.out.println("ola mundo");
    }
}