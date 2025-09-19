package ut1.t1.robin.gonzalez.anton;

/**
 * @author Robin
 */
public class Palabras {
    
    // Atributos Privados de la Clase
    
    String palabra, pista;
    
    // Constructores
    
    // Por defecto
    
    public Palabras(){
        palabra = "";
        pista = "";
    }
    
    // Parametrizado
    
    public Palabras(String palabra, String pista){
        this.palabra = palabra;
        this.pista = pista;
    }
    
    // Getters y Setters

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }
    
    // ToString
    
    @Override
    public String toString() {
        return "Palabras{" + "palabra=" + palabra + ", pista=" + pista + '}';
    }
    
}
