import java.util.ArrayList;
public abstract class Triangulo extends Forma {
    String tipo;

    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;

    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static Triangulo defineTipo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado1 == lado3) {
            return new TrianguloEquilatero(lado1);
        } else if(lado1==lado2 || lado2==lado3 || lado3==lado1){
            return new TrianguloIsosceles(lado1, lado2, lado3);
        }else if(lado1 ==lado2 &&lado2 !=lado3 ||lado3 ==lado1 &&lado2 !=lado1 ||lado2 ==lado3 &&lado1 !=lado3){
            return new TrianguloEscaleno(lado1,lado2, lado3);

        }
        return null;
    }

    @Override
    public String toString() {
        return " " +
                "\nTipo= " + tipo+
                "\nLado 1=" + lado1 +
                "\nLado 2=" + lado2 +
                "\nLado 3=" + lado3+
                "\nPerímetro=" +perimetro+
                "\nÁrea="+ area;
    }
}
