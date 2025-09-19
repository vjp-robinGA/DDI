package prueba1;

/**
 * @author Robin
 */
public class PruebaPalabras {

    // Atributos Privados de la Clase

    String primera, segunda, tercera;
    
    // Constructores
    
    // Por defecto

    public PruebaPalabras(){
        primera = "";
        segunda = "";
        tercera = "";
    }
    
    // Parametrizado

    public PruebaPalabras(String primera, String segunda, String tercera){
        this.primera = primera;
        this.segunda = segunda;
        this.tercera = tercera;
    }
    
    // Getters y Setters

    public String getPrimera() {
        return primera;
    }

    public void setPrimera(String primera) {
        this.primera = primera;
    }

    public String getSegunda() {
        return segunda;
    }

    public void setSegunda(String segunda) {
        this.segunda = segunda;
    }

    public String getTercera() {
        return tercera;
    }

    public void setTercera(String tercera) {
        this.tercera = tercera;
    }
    
    // ToString

    @Override
    public String toString() {
        return "PruebaPalabras{" + "primera=" + primera + ", segunda=" + segunda + ", tercera=" + tercera + '}';
    }

}
