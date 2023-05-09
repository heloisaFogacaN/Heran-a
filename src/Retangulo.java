import java.util.ArrayList;
public class Retangulo extends Forma{

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setArea(double lado1, double lado2) {
        this.area = lado1*lado2;
    }

    public void setPerimetro(double lado1, double lado2) {
        this.perimetro = 2*(lado1 + lado2);
    }

    public double getlado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return " " +
                "\nComprimento=" + lado1 +
                "\nBase=" + lado2 +
                "\nÁrea=" + area +
                "\nPerímetro=" + perimetro;
    }

}
