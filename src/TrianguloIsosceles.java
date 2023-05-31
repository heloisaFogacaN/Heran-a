public class TrianguloIsosceles extends Triangulo{
    public TrianguloIsosceles(double lado1,double lado2, double lado3){
        super(lado1, lado2, lado3);
        this.calcArea();
        this.setTipo("Isósceles");
    }
    public double calcArea() {
        if(lado1==lado2){
            double altura= (Math.sqrt(lado2*lado2)-((lado3*lado3)/4));
            area=(lado3*altura)/2;
        } else if(lado2==lado3){
            double altura= (Math.sqrt(lado1*lado1)-((lado2*lado2)/4));
            area=(lado1*altura)/2;
        } else if(lado1==lado3){
            double altura= (Math.sqrt(lado2*lado2)-((lado3*lado3)/4));
            area=(lado2*altura)/2;

        }
        return area;
    }

}
