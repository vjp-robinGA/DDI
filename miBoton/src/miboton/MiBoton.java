package miboton;

import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * @author Robin
 */
public class MiBoton extends JButton implements Serializable{

    private String ruta;
    
    public MiBoton(){
        
        ruta = "./mina.png";
        
        ImageIcon icono = new ImageIcon(getClass().getResource(ruta));
        
        ImageIcon icon = new ImageIcon(icono.getImage().getScaledInstance(50, 50, 50));
        this.setIcon(icon);
        this.setIconTextGap(2);
        
        this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        this.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        this.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        this.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        
    }

}
