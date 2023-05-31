import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
public class Circulo extends Forma {
    public Circulo(double raio){
        this.raio=raio;
        this.calcPerimetro();
        this.calcArea();
        Forma.adicionarForma(this);
    }

    @Override
    public double calcArea() {
        return area = 3.14*(raio*raio);
    }

    @Override
    public double calcPerimetro() {
        return perimetro = 3.14*2*raio;
    }

    public static String mostrarObjetos() {
        String objetos="";
            for (Forma forma: Forma.formas){
                if (forma instanceof Circulo){
                    objetos+=forma+"\n";
                }
            }
        return objetos;
    }

    @Override
    public String toString() {
        return "Círculo:" +
                "\nRaio=" + raio +
                "\nÁrea=" + area +
                "\nPerímetro=" + perimetro;
    }
}
