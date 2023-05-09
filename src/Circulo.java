import java.util.ArrayList;
public class Circulo extends Forma {

    double  raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setPerimetro(double raio) {
        this.perimetro = 3.14*2*raio;
    }

    public void setArea(double raio) {
        this.area = 3.14*(raio*raio);
    }

    @Override
    public String toString() {
        return " " +
                "\nRaio=" + raio +
                "\nÁrea=" + area +
                "\nPerímetro=" + perimetro;
    }
}
