public class Lampada extends DispositivoInteligente {
    int intensidade;
    public Lampada(String dispositivo) {
        super(dispositivo);
        this.intensidade = 50;
    }
    
    public void ligar() {
        setEstado(true);
        System.out.println(getDispositivo() + " ligada.");
    }
    
    public void desligar() {
        setEstado(false);
        System.out.println(getDispositivo() + " desligada.");
    }
    
    public void setIntensidade(int novaIntensidade) {
        if (novaIntensidade >= 0 && novaIntensidade <= 100) {
            this.intensidade = novaIntensidade;
            System.out.println(getDispositivo() + " intensidade ajustada para " + intensidade + ".");
        } else {
            System.out.println("Intensidade inválida. Use um valor entre 0 e 100.");
        }
    }

    public int getIntensidade() {
        return this.intensidade;
    }

}
