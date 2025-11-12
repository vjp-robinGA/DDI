package Panel;

import java.io.File;
import java.io.Serializable;

/**
 * @author Robin
 */
public class ImagenFondo implements Serializable{

    File rutaImagen;
    float opacidad;

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public float getOpacidad() {
        return opacidad;
    }

    public void setOpacidad(float opacidad) {
        this.opacidad = opacidad;
    }

    public ImagenFondo() {
    }

    public ImagenFondo(File rutaImagen, float opacidad) {
        this.rutaImagen = rutaImagen;
        this.opacidad = opacidad;
    }

}
