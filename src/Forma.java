import java.util.ArrayList;
public abstract class Forma{
    static ArrayList<Forma> formas=new ArrayList<>();

    public static void adicionarForma(Forma forma){
        formas.add(forma);
    }

    public abstract double calcArea();
    public abstract double calcPerimetro();

    public static void mostrarTodos(){
        for(Forma forma: formas){
            System.out.println(forma+"\n");

        }
    }
    double area, lado1, lado2, lado3, perimetro, raio;

}
