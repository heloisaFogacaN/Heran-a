import java.util.ArrayList;

public abstract class Forma{
    static ArrayList<Forma> formas=new ArrayList<>();

    public static void adicionarForma(Forma forma){
        formas.add(forma);
    }

    public abstract double calArea();
    public abstract double calPerimetro();

    public static void mostrarTodos(){
        for(Forma forma: formas){
            System.out.println(forma+"\n");

        }
    }
    public static void mostrarCirculo(){
        for (Forma forma: Forma.formas){
            if (forma instanceof Circulo){
                System.out.println(forma);
            }
        }
    }
    public static void mostrarQuadrado(){
        for (Forma forma: Forma.formas){
            if (forma instanceof Quadrado){
                System.out.println(forma);
            }
        }
    }
    public static void mostrarRetangulo(){
        for (Forma forma: Forma.formas){
            if (forma instanceof Retangulo){
                System.out.println(forma);
            }
        }
    }
    public static void mostrarTriangulo(){
        for (Forma forma: Forma.formas){
            if (forma instanceof Triangulo){
                System.out.println(forma);
            }
        }
    }

    double area, lado1, lado2, lado3, perimetro, raio;

}
