import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
public class Circulo extends Forma {
    public Circulo(double raio){
        this.raio=raio;
        this.calPerimetro();
        this.calArea();
        Forma.adicionarForma(this);
    }

    public double calPerimetro() {
        return perimetro = 3.14*2*raio;
    }

    public double calArea() {
        return area = 3.14*(raio*raio);
    }

    @Override
    public String toString() {
        return " " +
                "\nRaio=" + raio +
                "\nÁrea=" + area +
                "\nPerímetro=" + perimetro;
    }
}
