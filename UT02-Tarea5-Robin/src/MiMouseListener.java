
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author Robin
 */
public class MiMouseListener implements MouseListener{
    
    VentanaPrincipal padre;

    public void setPadre(VentanaPrincipal padre) {
        this.padre = padre;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    public void mouseEntered(MouseEvent e) {
        
        Perdiste perdiste = new Perdiste(padre, true);
        perdiste.setVisible(true);
        
        padre.cerrarNivel1();
        padre.cerrarNivel2();
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    

}
