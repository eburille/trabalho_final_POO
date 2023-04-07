public class TV extends DispositivoInteligente {
    private int canal;
    private int volume;
    
    public TV(String dispositivo) {
    super(dispositivo);
    canal = 1;
    volume = 50;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println(getDispositivo() + " canal ajustado para " + canal + ".");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int novoVolume) {
        if (novoVolume >= 0 && novoVolume <= 100) {
            volume = novoVolume;
            System.out.println(getDispositivo() + " volume ajustado para " + volume + ".");
        } else {
            System.out.println("Volume inválido. Use um valor entre 0 e 100.");
        }
    }

}
