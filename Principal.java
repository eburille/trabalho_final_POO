import java.io.*;
import java.util.*; 

public class Principal
{
    public static void main(String[] args) {
        File file = new File("estado_Arquivos.txt");
        casa casa = new casa();
            try{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr); 
    
                while (br.ready()){
                    String linha = br.readLine();
                    casa.registrarComodo(new Comodo(linha.split(";")[0]));
                }
    
                br.close();
                fr.close();
            }
             catch (FileNotFoundException not_found){
                        System.out.println("Arquivo não existe!!");
                    }catch (IOException IOE){
                        System.out.println("Erro de IO");
                    }
    }
}   
    
 

//