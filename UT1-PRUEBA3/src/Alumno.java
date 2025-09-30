/**
 * @author Robin
 */
public class Alumno {

    // Atributos Privados de la Clase

    private String nombre, apellidos, curso;
    
    // Constructores
    
    // Por defecto
    
    public Alumno(){
        this.nombre = "";
        this.apellidos = "";
        this.curso = "";
    }

    // Parametrizado

    public Alumno(String nombre, String apellidos, String curso){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curso = curso;
    }
    
    // Getters y Setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // ToArrayString
    
    public String[] toArrayString(){
        
        String[] arrayString = new String[3];
        
        arrayString[0]=nombre;
        arrayString[1]=apellidos;
        arrayString[2]=curso;
        
        return arrayString;
        
    }
    
    // ToString

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", curso=" + curso + '}';
    }

}
