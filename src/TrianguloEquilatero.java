public class TrianguloEquilatero extends Triangulo{

    public TrianguloEquilatero(double lado1){
        super(lado1, lado1, lado1);
        this.calcArea();
        this.setTipo("Equilátero");
    }

    @Override
    public double calcArea() {
        return area=(Math.sqrt(3)/4)*(lado1*lado1);

    }

}
