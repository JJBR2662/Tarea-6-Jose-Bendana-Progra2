package pkg30.pkg1.pkg2023;

public class Micro {
    private String marca;
    private double potencia;

    public Micro() {
    }

    public Micro(String marca, double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        if(potencia>0){
            this.potencia = potencia;
        }else{
            System.out.println("Potencia no valida");
        }
    }

    @Override
    public String toString() {
        return "Micro{" + "marca=(" + marca + "), potencia=(" + potencia + ")}";
    }
    
    
}
