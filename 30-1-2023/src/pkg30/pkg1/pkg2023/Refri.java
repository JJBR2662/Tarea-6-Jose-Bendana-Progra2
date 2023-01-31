package pkg30.pkg1.pkg2023;

import java.awt.Color;

public class Refri {
    private String marca, modelo;
    private int tamanio;
    private Color color;
    
    public Refri(){
        
    }

    public Refri(String marca, String modelo, int tamanio, Color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanio = tamanio;
        this.color = color;
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

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
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
        return "Refri{ marca=(" + marca + ") modelo=(" + modelo + ") tamanio=(" + tamanio + ") color=(" + color +")}";
    }
    
    
    
}
