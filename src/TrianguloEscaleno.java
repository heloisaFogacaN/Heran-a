public class TrianguloEscaleno extends Triangulo{
    public TrianguloEscaleno(double lado1,double lado2, double lado3){
        super(lado1, lado2, lado3);
        this.calcArea();
        this.setTipo("Isósceles");
    }
    public double calcArea() {
        double semiperimetro=perimetro/2;
        return area=(Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3)));

    }
}
