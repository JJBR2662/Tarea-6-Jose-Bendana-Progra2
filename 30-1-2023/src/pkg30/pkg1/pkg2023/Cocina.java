package pkg30.pkg1.pkg2023;

import java.util.ArrayList;

public class Cocina {
    private int tamanio;
    private ArrayList<String> utencilios = new ArrayList();
    private Refri refri;
    private Micro micro;

    public Cocina() {
    }

    public Cocina(int tamanio, ArrayList<String> utencilios, Refri refri, Micro micro) {
        this.tamanio = tamanio;
        this.utencilios=utencilios;
        this.refri = refri;
        this.micro = micro;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        if(tamanio>0){
            this.tamanio = tamanio;
        }else{
            System.out.println("Tamanio no valido");
        }
    }

    public ArrayList<String> getUtencilios() {
        return utencilios;
    }

    public void setUtencilios(ArrayList<String> utencilios) {
        this.utencilios = utencilios;
    }

    public Refri getRefri() {
        return refri;
    }

    public void setRefri(Refri refri) {
        this.refri = refri;
    }

    public Micro getMicro() {
        return micro;
    }

    public void setMicro(Micro micro) {
        this.micro = micro;
    }

    @Override
    public String toString() {
        return "tamanio=" + tamanio + " utencilios=" + utencilios + ", refri=" + refri + ", micro=" + micro;
    }
    
    
    
}
