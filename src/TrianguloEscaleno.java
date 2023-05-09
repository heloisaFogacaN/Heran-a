public class TrianguloEscaleno extends Triangulo{
    public TrianguloEscaleno(double lado1,double lado2, double lado3){
        super(lado1, lado2, lado3);
        this.setArea(lado1, lado2, lado3);
        this.setPerimetro(lado1, lado2, lado3);
        this.setTipo("Isósceles");
    }
    public void setArea(double lado1, double lado2, double lado3) {
        double semiperimetro=getPerimetro()/2;
        this.area=(Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3)));

    }
    public void setPerimetro(double lado1, double lado2, double lado3){
        this.perimetro=lado1+lado2+lado3;
    }
    public double getPerimetro(){
        return perimetro;
    }
}
