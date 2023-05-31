import java.util.ArrayList;
public class Quadrado extends Forma {

    public Quadrado(double lado1){
        this.lado1=lado1;
        this.calcArea();
        this.calcPerimetro();
        Forma.adicionarForma(this);
    }

    @Override
    public double calcArea() {
        return area = lado1 * 2;
    }

    @Override
    public double calcPerimetro() {
        return perimetro = lado1*4;
    }


    public static String mostrarObjetos() {
        String objetos="";
            for (Forma forma: Forma.formas){
                if (forma instanceof Quadrado){
                    objetos+=forma+"\n";
                }
            }
        return objetos;
    }

    @Override
    public String toString() {
        return "Quadrado: " +
                "\nLado=" + lado1 +
                "\nÁrea=" + area +
                "\nPerímetro=" + perimetro+"\n";
    }
}
