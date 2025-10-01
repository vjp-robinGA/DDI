/**
 * @author Robin
 */
public class Pokemon {

    // Atributos Privados de la Clase

    private String pokemon, tipo, ataque1, ataque2, ataque3;
    
    // Constructores
    
    // Por defecto

    public Pokemon() {
        this.pokemon = "";
        this.tipo = "";
        this.ataque1 = "";
        this.ataque2 = "";
        this.ataque3 = "";
    }

    // Parametrizado

    public Pokemon(String pokemon, String tipo, String ataque1, String ataque2, String ataque3) {
        this.pokemon = pokemon;
        this.tipo = tipo;
        this.ataque1 = ataque1;
        this.ataque2 = ataque2;
        this.ataque3 = ataque3;
    }
    
    // Getters y Setters
    
    public String getPokemon() {
        return pokemon;
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAtaque1() {
        return ataque1;
    }

    public void setAtaque1(String ataque1) {
        this.ataque1 = ataque1;
    }

    public String getAtaque2() {
        return ataque2;
    }

    public void setAtaque2(String ataque2) {
        this.ataque2 = ataque2;
    }

    public String getAtaque3() {
        return ataque3;
    }

    public void setAtaque3(String ataque3) {
        this.ataque3 = ataque3;
    }

    // ToArrayString
    
    public String[] toArrayString(){
        
        String[] arrayString = new String[5];
        
        arrayString[0]=pokemon;
        arrayString[1]=tipo;
        arrayString[2]=ataque1;
        arrayString[3]=ataque2;
        arrayString[4]=ataque3;
        
        return arrayString;
        
    }
    
    // ToString

    @Override
    public String toString() {
        return "Pokemon{" + "pokemon=" + pokemon + ", tipo=" + tipo + ", ataque1=" + ataque1 + ", ataque2=" + ataque2 + ", ataque3=" + ataque3 + '}';
    }
    
}
