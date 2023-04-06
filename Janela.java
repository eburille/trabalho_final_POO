public class Janela extends DispositivoInteligente {
    public Janela(String dispositivo) {
        super(dispositivo);
    }
    
    public void abrir() {
        setEstado(true);
        System.out.println(getDispositivo() + " aberta.");
    }
    
    public void fechar() {
        setEstado(false);
        System.out.println(getDispositivo() + " fechada.");
    }
}