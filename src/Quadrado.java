import java.util.ArrayList;
public class Quadrado extends Forma {

    public Quadrado(double lado1){
        this.lado1=lado1;
        this.calArea();
        this.calPerimetro();
    }

    public double calArea() {
        return area = lado1 * 2;
    }

    public double calPerimetro() {
        return perimetro = lado1*4;
    }

    @Override
    public String toString() {
        return " " +
                "\nLado=" + lado1 +
                "\nÁrea=" + area +
                "\nPerímetro=" + perimetro;
    }
}
