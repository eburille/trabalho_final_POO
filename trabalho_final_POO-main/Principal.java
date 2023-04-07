import java.io.*;
import java.util.*; 

public class Principal
{
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
try{
        Comodo comodo = new Comodo("casa");//por algum motivo o scanner aqui n tava funcionando qndo eu mudava o "casa" pela var usuario
        FileOutputStream os = new FileOutputStream("Dispositivos.txt");

        ObjectOutputStream oarq = new ObjectOutputStream(os);

        oarq.writeObject(comodo);

        oarq.close();

        }catch (IOException e){
            System.out.println("Erro de IO");
        }
    }
}   
    
 

//