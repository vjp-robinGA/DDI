package com.mycompany.basedatoscoche;

/**
 * @author Robin
 */
public class Coche {

    // Atributos Privados de la Clase

    int idCoche;
    String marca, modelo, imagen;
    
    // Constructores
    
    // Por defecto

    public Coche(){
        idCoche = 0;
        marca = "";
        modelo = "";
        imagen = "";
    }
    
    // Parametrizado

    public Coche(int idCoche, String marca, String modelo, String imagen){
        this.idCoche = idCoche;
        this.marca = marca;
        this.modelo = modelo;
        this.imagen = imagen;
    }
    
    // Getters y Setters

    public int getIdCoche() {
        return idCoche;
    }

    public void setIdCoche(int idCoche) {
        this.idCoche = idCoche;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    // ToArrayString

    public String[] toArrayString(){
        String[] a = {""+idCoche, marca, modelo, imagen};
        
        return a;
    }
    
}
