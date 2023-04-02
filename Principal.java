import java.io.*;
import java.util.*; 

public class Principal
{
    public static void main(String[] args) {
        File file = new File("estado_Arquivos.txt");
        Comodo comodo = new Comodo();
            try{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr); 
    
                while (br.ready()){
                    String linha = br.readLine();
                    comodo.add(new Comodo(linha.split(";")[0], Double.parseDouble(linha.split(";")[1])
                    )
                    );
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