package ejercicio;

public class Rectangulo implements Figura{

    private double base;
    private double altura;

    // metodo constructor
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    // getters y setters
    public double getBase(){
        return base;
    }
    public void setBase(){
        this.base = base;
    }

    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    // metodos
    @Override
    public double CalcularArea() {
        return base * altura;
    }

    @Override
    public double CalcularPerimetro() {
        return base*2 + altura*2;
    }

    @Override
    public String toString(){
        return "El rectángulo tiene \n" +
                "Altura: " + altura + "cm \n" +
                "Base: " + base + "cm \n";
    }

    public void mostrarMensaje(){
        System.out.println(toString());
    }
}
