import java.time.LocalDateTime;   
import java.time.format.DateTimeFormatter; 

public class relogio extends DispositivoInteligente
{
    public relogio()
    {
        super("Relogio");
        super.estado = true;
    }

    public String getHora(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");  
        return ((String)dtf.format(LocalDateTime.now()));
    }
}
