public class TrianguloEquilatero extends Triangulo{

    public TrianguloEquilatero(double lado1){
        super(lado1, lado1, lado1);
        this.setArea(lado1);
        this.setTipo("Equilátero");
        this.setPerimetro(lado1);
    }
    public void setPerimetro(double lado1){
        this.perimetro=lado1*3;
    }
    public void setArea(double lado1) {
        this.area=(Math.sqrt(3)/4)*(lado1*lado1);

    }


}
