package pkg30.pkg1.pkg2023;

public class Dormitorio {
    private Cama cama;
    private String armario;

    public Dormitorio() {
    }

    public Dormitorio(Cama cama, String armario) {
        this.cama = cama;
        this.armario = armario;
    }

    public Cama getCama() {
        return cama;
    }

    public void setCama(Cama cama) {
        this.cama = cama;
    }

    public String getArmario() {
        return armario;
    }

    public void setArmario(String armario) {
        this.armario = armario;
    }

    @Override
    public String toString() {
        return "Dormitorio{" + "cama=(" + cama + "), armario=(" + armario + ")}";
    }
    
    
}
