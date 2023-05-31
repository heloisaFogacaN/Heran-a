import javax.swing.*;
import javax.swing.text.InternationalFormatter;
import java.text.Normalizer;
import java.util.Scanner;
public class Main {
    private static Professor professorLogado;
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        cadastrar();
        login();

    }

    public static void cadastrar() {
        Professor professor = new Professor("123");
        Professor.professores.add(professor);
    }

    private static void login() {
        int contador = 0;
        do {
            System.out.println("Informe sua senha:");
            String senha = scanner.next();
            professorLogado= Professor.verificadorSenha(senha);
            if (professorLogado != null ) {
                System.out.println("Bem-vindo!");
                menu();
            } else {
                if (contador < 3) {
                    System.out.println("Senha inválida!\nTente novamente\nVocê ainda possui " + (3 - contador) + " tentativas!");
                }
                contador++;
            }
        } while (contador < 4);
    }
    private static void menu(){
        int opcao=1;
        do{
            System.out.println("""
                1- Cadastrar círculo
                2- Cadastrar quadrado
                3- Cadastrar retângulo
                4- Cadastrar triângulo
                5- Listrar formas
                0- Logout
                """);
            opcao=scanner.nextInt();
            switch (opcao){
                case 1:
                    cadastrarCirculo();
                    break;
                case 2:
                    cadastrarQuadrado();
                    break;
                case 3:
                    cadastrarRetangulo();
                    break;
                case 4:
                    cadastrarTriangulo();
                    break;
                case 5:
                    listarFormas();
                    break;
                case 6:
                    professorLogado = null;
                    login();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao!=6);
    }

    private static void listarFormas() {
        int opcao=1;
        do{
            System.out.println("""
                Listar:
                1- Círculo
                2- Quadrado
                3- Retângulo
                4- Triângulo
                5- Listar todas as formas já cadastradas
                0- Voltar ao Menu 
                """);
            opcao=scanner.nextInt();
            String forma= "";
            switch (opcao){
                case 1:
                    forma= Circulo.mostrarObjetos();
                    System.out.println(forma);
                    break;
                case 2:
                    forma=Quadrado.mostrarObjetos();
                    System.out.println(forma);
                    break;
                case 3:
                    forma=Retangulo.mostrarObjetos();
                    System.out.println(forma);
                    break;
                case 4:
                    forma=Triangulo.mostrarObjetos();
                    System.out.println(forma);
                    break;
                case 5:
                    Forma.mostrarTodos();
                    break;
            }
        } while(opcao!=0);
    }


    private static void cadastrarTriangulo() {
        System.out.println("Informe o valor do lado 1:");
        double lado1= scanner.nextDouble();
        System.out.println("Informe o valor do lado 2:");
        double lado2 = scanner.nextDouble();
        System.out.println("Informe o valor do lado 3");
        double lado3= scanner.nextDouble();
        Triangulo triangulo= Triangulo.defineTipo(lado1, lado2, lado3);
        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2) {
            System.out.println("As medidas formam um triângulo válido.");
            Forma.adicionarForma(triangulo);
        } else {
            System.out.println("As medidas não formam um triângulo válido.");
        }
    }

    private static void cadastrarRetangulo() {
        System.out.println("Informe o valor do comprimento do retângulo:");
        double lado1= scanner.nextDouble();
        System.out.println("Informe o valor da base do retângulo:");
        double lado2=scanner.nextDouble();
        if(lado1!=lado2){
            System.out.println("As medidas fornecidas coorespodem a um retângulo!");
            Forma forma = new Retangulo(lado1, lado2);
        } else{
            System.out.println("Retângulo inválido!");
        }
    }

    private static void cadastrarQuadrado() {
        System.out.println("Informe o valor do lado do quadrado");
        double lado1= scanner.nextDouble();
        Forma forma = new Quadrado(lado1);
    }

    private static void cadastrarCirculo() {
        System.out.println("Informe o valor do raio:");
        double raio=scanner.nextDouble();
        Forma forma = new Circulo(raio);
    }
}