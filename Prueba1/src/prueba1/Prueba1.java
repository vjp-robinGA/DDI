package prueba1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Robin
 */
public class Prueba1 {

    public static List<PruebaPalabras> cargarDatos(){
                
        File archivoTexto = null;
        FileReader lector = null;
        BufferedReader buffer = null;
        
        List<PruebaPalabras> arrayPalabras = new ArrayList<>();
        
        PruebaPalabras palabras[] = new PruebaPalabras[10];
        
        try{
            
            archivoTexto = new File("Prueba.txt");
            lector = new FileReader(archivoTexto);
            buffer = new BufferedReader(lector);
            
            String lineaActual;
            
            while( (lineaActual=buffer.readLine()) != null){
                
                String leido[] = new String[3];
                leido = lineaActual.split(";");
                
                String primera = leido[0];
                String segunda = leido[1];
                String tercera = leido[2];
                
                PruebaPalabras pal = new PruebaPalabras(primera, segunda, tercera);
                
                arrayPalabras.add(pal);
                
            }
                
        }catch(Exception e){
            
            e.printStackTrace();
            
        }finally{
            try{
                if(null != lector){
                    lector.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
        
        return arrayPalabras;
        
    }
    
    public static void main(String[] args) {
        
        List<PruebaPalabras> palabras = cargarDatos();
        
        System.out.println(palabras.toString());
        
    }

}
