import java.util.ArrayList;
public class Quadrado extends Forma {



    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado) {
        this.lado1 = lado;
    }

    public void setArea(double lado) {
        this.area=lado*2;
    }

    public void setPerimetro(double lado) {
        this.perimetro = lado*4;
    }

    @Override
    public String toString() {
        return " " +
                "\nLado=" + lado1 +
                "\nÁrea=" + area +
                "\nPerímetro=" + perimetro;
    }
}
