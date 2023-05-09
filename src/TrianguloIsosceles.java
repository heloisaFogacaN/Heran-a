public class TrianguloIsosceles extends Triangulo{
    public TrianguloIsosceles(double lado1,double lado2, double lado3){
        super(lado1, lado2, lado3);
        this.setArea(lado1, lado2, lado3);
        this.setPerimetro(lado1, lado2, lado3);
        this.setTipo("Isósceles");
    }
    public void setArea(double lado1, double lado2, double lado3) {
        if(lado1==lado2){
            double altura= (Math.sqrt(lado2*lado2)-((lado3*lado3)/4));
            this.area=(lado3*altura)/2;
        } else if(lado2==lado3){
            double altura= (Math.sqrt(lado1*lado1)-((lado2*lado2)/4));
            this.area=(lado1*altura)/2;

        } else if(lado1==lado3){
            double altura= (Math.sqrt(lado2*lado2)-((lado3*lado3)/4));
            this.area=(lado2*altura)/2;

        }
    }
    public void setPerimetro(double lado1, double lado2, double lado3) {
        if(lado1==lado2){
            this.perimetro=lado3+2*lado1;
        } else if(lado2==lado3){
            this.perimetro=lado1+2*lado2;
        } else if(lado1==lado3){
            this.perimetro=lado2+2*lado1;
        }
        this.area=(Math.sqrt(3)/4)*(lado1*lado1);

    }

}
