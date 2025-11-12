package Panel;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 * @author Robin
 */
public class ImagenPES extends PropertyEditorSupport{

    private ImagenFondoPanel imagenFondoPanel = new ImagenFondoPanel();
    
    @Override
    public boolean supportsCustomEditor() {
        return super.supportsCustomEditor(); 
    }

    @Override
    public Component getCustomEditor() {
        return super.getCustomEditor(); 
        
    }

    @Override
    public String getJavaInitializationString() {
        return super.getJavaInitializationString(); 
    }

    @Override
    public Object getValue() {
        return super.getValue(); 
    }

    

}
