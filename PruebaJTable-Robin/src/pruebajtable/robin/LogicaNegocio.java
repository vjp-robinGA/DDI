package pruebajtable.robin;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Robin
 */
public class LogicaNegocio {

    List <Alumno> alumnos;
    
    public LogicaNegocio(){
        
        alumnos = new ArrayList<>();
        
        alumnos.add(new Alumno("Alumno1","Apellido1","Curso1"));
        alumnos.add(new Alumno("Alumno2","Apellido2","Curso2"));
        alumnos.add(new Alumno("Alumno3","Apellido3","Curso3"));
        
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }
    
}