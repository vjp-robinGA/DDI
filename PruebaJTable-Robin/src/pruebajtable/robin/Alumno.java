package pruebajtable.robin;

/**
 * @author Robin
 */
public class Alumno {

    // Atributos Privados de la Clase

    private String nombre, apellido, curso;
    
    // Constructores

    // Por defecto

    public Alumno() {
    
        this.nombre = "";
        this.apellido = "";
        this.curso = "";
    
    }
    
    // Parametrizado

    public Alumno(String nombre, String apellido, String curso) {
    
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
    
    }
    
    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    // ToString

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", curso=" + curso + '}';
    }

}
