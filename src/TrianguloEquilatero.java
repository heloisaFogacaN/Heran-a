public class TrianguloEquilatero extends Triangulo{

    public TrianguloEquilatero(double lado1){
        super(lado1, lado1, lado1);
        this.calArea();
        this.setTipo("Equilátero");
        this.calPerimetro();
    }
    public double calPerimetro(){
        return perimetro=lado1*3;
    }
    public double calArea(){
        return area=(Math.sqrt(3)/4)*(lado1*lado1);

    }


}
