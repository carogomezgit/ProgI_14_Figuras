import ejercicio.Circulo;
import ejercicio.Rectangulo;
import org.w3c.dom.css.Rect;

/**
 * Crea una interfaz llamada Figura que contenga los siguientes métodos: double calcularArea(); double calcularPerimetro();
 * Luego, crea dos clases que implementen esta interfaz:
 * Circulo – que tenga como atributo el radio.
 * Rectangulo – que tenga como atributos el ancho y el alto.
 * Finalmente, crea una clase de prueba (Main) donde instancies un círculo y un rectángulo, y muestres por consola su área y perímetro.
 */
public class Main {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(3);

        System.out.println(circulo1.toString());

        Rectangulo rectangulo1 = new Rectangulo(20, 12);

        System.out.println(rectangulo1.toString());

        // calcular y mostrar resultado
        System.out.println("El área de este circulo es: " + circulo1.CalcularArea() + "cm2");
        System.out.println("El perímetro de este círculo es: " + circulo1.CalcularPerimetro() + "cm");

        System.out.println("El área de este rectángulo es: " + rectangulo1.CalcularArea() + "cm2");
        System.out.println("El perímetro de este rectángulo es: " + rectangulo1.CalcularPerimetro() + "cm");



    }
}