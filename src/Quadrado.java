import java.util.ArrayList;
public class Quadrado extends Forma {

    public Quadrado(double lado1){
        this.lado1=lado1;
        this.setArea(lado1);
        this.setPerimetro(lado1);
    }



    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setArea(double lado1) {
        this.area=lado1*2;
    }

    public void setPerimetro(double lado1) {
        this.perimetro = lado1*4;
    }

//    public static void listarQuadrados() {
//        int i=1;
//        for (Quadrado quadrado : quadrados) {
//            System.out.println("Quadrado-" + i  + quadrado.toString() + "\n");
//            i++;
//        }
//
//    }

    @Override
    public String toString() {
        return " " +
                "\nLado=" + lado1 +
                "\nÁrea=" + area +
                "\nPerímetro=" + perimetro;
    }
}
