public class Porta extends DispositivoInteligente {
    public Porta(String dispositivo) {
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