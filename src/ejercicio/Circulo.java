package ejercicio;

public class Circulo implements Figura{

    private double radio;

    // metodo constructor
    public Circulo(double radio){
        this.radio = radio;
    }

    // getters y setters
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }

    // metodos
    @Override
    public double CalcularArea() {
        return pi*(radio*radio);
    }

    @Override
    public double CalcularPerimetro() {
        return pi*(radio*2);
    }

    @Override
    public String toString(){
       return "El círculo tiene \n" +
                "Radio: " + radio + "cm \n" +
               "Diámetro: " + radio*2 + "cm";
    }

    public void mostrarMensaje(){
        System.out.println(toString());
    }
}
