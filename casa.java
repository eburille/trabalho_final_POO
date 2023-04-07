import java.util.*;
public class casa
{
    private ArrayList<Comodo> comodos = new ArrayList<Comodo>();
    
    public casa(){
        
    }

    public void registrarComodo(Comodo novoVomodo){
        comodos.add(novoVomodo);
    }

    public ArrayList<Comodo> getComodos(){
        return comodos;
    }
}
