import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
public class Circulo extends Forma {
    public Circulo(double raio){
        this.setPerimetro(raio);
        this.setArea(raio);
        Forma.adicionarForma(this);
    }

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

//    public static void listarCirculos() {
//        System.out.println("oi");
//        int i = 1;
//        for (Circulo circulo : circulos) {
//            System.out.println("oiiiii");
//            System.out.println("Circulo-" + i + circulo.toString() + "\n");
//            i++;
//        }
//    }
    @Override
    public String toString() {
        return " " +
                "\nRaio=" + raio +
                "\nÁrea=" + area +
                "\nPerímetro=" + perimetro;
    }
    teste
}
