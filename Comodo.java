import java.util.*;

public class Comodo{

    private ArrayList<DispositivoInteligente> Dispositivos = new ArrayList<DispositivoInteligente>();
    private String nomeComodo;

    public Comodo(String nome){
        this.nomeComodo = nome;
    }

    public void adicionarDispositivo(DispositivoInteligente novoDispositivo){
        this.Dispositivos.add(novoDispositivo);
        
        return;
    }

    public ArrayList<DispositivoInteligente> getListaDispositivos(){
        return this.Dispositivos;
    }

    public String getNomeComodo() {
        return this.nomeComodo;
    }
}
