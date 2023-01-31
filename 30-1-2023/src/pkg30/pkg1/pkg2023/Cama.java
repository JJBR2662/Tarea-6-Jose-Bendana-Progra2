package pkg30.pkg1.pkg2023;

import java.awt.Color;

public class Cama {
    private String marca, tamanio;
    private Color color;

    public Cama() {
    }

    public Cama(String marca, String tamanio, Color color) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cama{" + "marca=(" + marca + "), tamanio=(" + tamanio + "), color=(" + color + ")}";
    }
    
    
}
