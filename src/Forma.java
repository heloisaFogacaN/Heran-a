import java.util.ArrayList;

public abstract class Forma{
    static ArrayList<Forma> formas=new ArrayList<>();

    public static void adicionarForma(Forma forma){
        formas.add(forma);
    }

    public abstract double calArea();
    public abstract double calPerimetro();

    double area, lado1, lado2, lado3, perimetro, raio;

}
