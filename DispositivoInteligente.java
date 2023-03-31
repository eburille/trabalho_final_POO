public class DispositivoInteligente
{
    protected boolean estado;
    private String dispositivo;
    public DispositivoInteligente(String dispositivo)
    {
        this.dispositivo = dispositivo;
        this.estado = false;
    }

    public boolean getEstado(){
        return this.estado;
    }
    
    public void setEstado(boolean novoEstado){
        this.estado = novoEstado;
    }

    public String getDispositivo(){
        return this.dispositivo;
    }
    
    public void setDispositivo(String novoDispositivo){
        this.dispositivo = novoDispositivo;
    }
}
