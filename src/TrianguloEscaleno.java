public class TrianguloEscaleno extends Triangulo{
    public TrianguloEscaleno(double lado1,double lado2, double lado3){
        super(lado1, lado2, lado3);
        this.calArea();
        this.calPerimetro();
        this.setTipo("Isósceles");
    }
    public double calArea() {
        double semiperimetro=getPerimetro()/2;
        return area=(Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3)));

    }
    public double calPerimetro(){
        return this.perimetro=lado1+lado2+lado3;
    }
    public double getPerimetro(){
        return perimetro;
    }
}
