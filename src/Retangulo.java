import java.util.ArrayList;
public class Retangulo extends Forma{

    public Retangulo(double lado1, double lado2){
        this.lado1=lado1;
        this.lado2=lado2;
        this.calcArea();
        this.calcPerimetro();
        Forma.adicionarForma(this);
    }

    @Override
    public double calcArea() {
        return area = lado1*lado2;
    }

    @Override
    public double calcPerimetro() {
        return perimetro = 2*(lado1 + lado2);
    }

    public static String mostrarObjetos() {
        String objetos="";
            for (Forma forma: Forma.formas){
                if (forma instanceof Retangulo){
                    objetos+=forma+"\n";
                }
            }
            return objetos;
    }

    @Override
    public String toString() {
        return "Retângulo:"+
                "\n Lado 1: "+lado1+
                "\n Lado 2: "+lado2+
                "\n Perimetro: "+perimetro+
                "\n Área: "+area+"\n";
    }
}
