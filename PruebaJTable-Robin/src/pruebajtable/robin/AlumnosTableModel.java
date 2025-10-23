package pruebajtable.robin;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @author Robin
 */
public class AlumnosTableModel extends AbstractTableModel {

    List<Alumno> alumnos;
    
    String[] nombresColumnas = {"Nombre", "Apellido", "Curso"};

    public AlumnosTableModel(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    @Override
    public int getRowCount() {
        
        return alumnos.size();
        
    }

    @Override
    public int getColumnCount() {
        
        return 3;
        
    }
    
    @Override
    public String getColumnName(int column) {
        
        return nombresColumnas[column];
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            
            case 0:
                return alumnos.get(rowIndex).getNombre();
            case 1:
                return alumnos.get(rowIndex).getApellido();
            case 2:
                return alumnos.get(rowIndex).getCurso();
            default:
                return null;
            
        }
        
    }

}
