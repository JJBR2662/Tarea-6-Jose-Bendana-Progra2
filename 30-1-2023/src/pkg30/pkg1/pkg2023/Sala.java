package pkg30.pkg1.pkg2023;

import java.util.ArrayList;

public class Sala {

    private ArrayList<String> sillones = new ArrayList();
    private ArrayList<String> cuadros = new ArrayList();

    public Sala() {
    }

    public ArrayList<String> getSillones() {
        return sillones;
    }

    public void setSillones(ArrayList<String> sillones) {
        this.sillones = sillones;
    }

    public ArrayList<String> getCuadros() {
        return cuadros;
    }

    public void setCuadros(ArrayList<String> cuadros) {
        this.cuadros = cuadros;
    }

    @Override
    public String toString() {
        return "Sala{ sillones=(" + sillones + "), cuadros=(" + cuadros + ")}";
    }

    
}
