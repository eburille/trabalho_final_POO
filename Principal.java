import java.io.*;
import java.util.*; 

public class Principal{
    public static void main(String[] args) {
        casa casa;
            try{
                ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("estado_casa.txt"));
                casa = (casa)entrada.readObject();
                entrada.close(); 

            }catch (FileNotFoundException not_found){
                System.out.println("Arquivo não existe!!");
            }catch (ClassNotFoundException CNFE){
                System.out.println("Não foi possivel encontrar os dados");
            }catch (IOException IOE){
                System.out.println("Erro de IO");
            }
    }
    
    public boolean salvar_dados(casa casa){
        try{
            ObjectOutputStream saida = new ObjectOutputStream(new FileOutputStream("estado_casa.txt") );
            saida.writeObject(casa);
            saida.close();

            return true;
        }catch(IOException e){
            System.out.println("Não foi possivel salvar");
            
            return false;
        }
    }
}
 

//