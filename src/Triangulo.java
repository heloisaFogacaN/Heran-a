public abstract class Triangulo extends Forma {
    String tipo;

    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
        this.calcPerimetro();
        this.calcArea();
        Forma.adicionarForma(this);
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

    public static String mostrarObjetos() {
        String objetos="";
            for (Forma forma: Forma.formas){
                if (forma instanceof Triangulo){
                   objetos+=forma+"\n";
                }
            }
        return objetos;
    }

    @Override
    public double calcPerimetro() {
        return lado1+lado2+lado3;
    }

    @Override
    public String toString() {
        return "Triângulo:"+
                "\n"+tipo+
                "\n Lado 1: "+lado1+
                "\n Lado 2: "+lado2+
                "\n Lado 3: "+lado3+
                "\n Perimetro: "+perimetro+
                "\n Área: "+area;
    }
}
