public class Lampada extends DispositivoInteligente {
    public Lampada(String dispositivo) {
        super(dispositivo);
    }
    
    public void ligar() {
        setEstado(true);
        System.out.println(getDispositivo() + " ligada.");
    }
    
    public void desligar() {
        setEstado(false);
        System.out.println(getDispositivo() + " desligada.");
    }
}