import javax.swing.*;
import javax.swing.text.InternationalFormatter;
import java.text.Normalizer;
import java.util.Scanner;
public class Main {
    private static Professor  professorLogado;
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
            System.out.println(professorLogado);

            if (professorLogado != null ) {
                System.out.println("Bem-vindo!");
                menu();
            } else {
                if (contador < 3) {
                    System.out.println("Senha inválida!\nTente novamente\nVocê ainda possui " + (3 - contador) + " tentativas!");
                } else if (contador == 3) {
                    System.out.println("Tentativas esgotadas");
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
            switch (opcao){
                case 1:
                    listarCirculos();
                    break;
                case 2:
                    listarQuadrados();
                    break;
                case 3:
                    listarRetangulos();
                    break;
                case 4:
                    listarTriangulos();
                    break;
                case 5:
                    listarTodasFormas();
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
        Retangulo retangulo= new Retangulo();
        System.out.println("Informe o valor do comprimento do retângulo:");
        retangulo.setLado1(scanner.nextDouble());
        System.out.println("Informe o valor da base do retângulo:");
        retangulo.setLado2(scanner.nextDouble());
        retangulo.setArea(retangulo.getlado1(), retangulo.getLado2());
        retangulo.setPerimetro(retangulo.getlado1(), retangulo.getLado2());
        if(retangulo.getlado1()!=retangulo.getLado2()){
            System.out.println("As medidas fornecidas coorespodem a um retângulo!");
            Forma.adicionarForma(retangulo);
        } else{
            System.out.println("Retângulo inválido!");
        }

    }

    private static void cadastrarQuadrado() {
        Quadrado quadrado=new Quadrado();
        System.out.println("Informe o valor do lado do quadrado");
        quadrado.setLado1(scanner.nextDouble());
        quadrado.setArea(quadrado.getLado1());
        quadrado.setPerimetro(quadrado.getLado1());
        Forma.adicionarForma(quadrado);

    }

    private static void cadastrarCirculo() {
        Circulo circulo=new Circulo();
        System.out.println("Informe o valor do raio:");
        circulo.setRaio(scanner.nextDouble());
        circulo.setArea(circulo.getRaio());
        circulo.setPerimetro(circulo.getRaio());
        Forma.adicionarForma(circulo);
    }

    private static void listarQuadrados() {
        int i=1;
        for (Quadrado quadrado : Quadrado.quadrados) {
            System.out.println("Quadrado-" + i  + quadrado.toString() + "\n");
            i++;
        }

    }
    private static void listarTriangulos() {
        int i=1;
        for (Triangulo triangulo: Triangulo.triangulos) {
            System.out.println("Triângulo-" + i  + triangulo.toString() + "\n");
            i++;
        }

    }
    private static void listarRetangulos() {
        int i=1;
        for (Retangulo retangulo : Retangulo.retangulos) {
            System.out.println("Retângulo-" + i  + retangulo.toString() + "\n");
            i++;
        }

    }
    private static void listarCirculos() {
        System.out.println("oi");
        int i = 1;
        for (Circulo circulo : Circulo.circulos) {
            System.out.println("oiiiii");
            System.out.println("Circulo-" + i + circulo.toString() + "\n");
            i++;
        }
    }
    private static void listarTodasFormas(){
        int i=1;
        for(Forma forma: Forma.formas){
            System.out.println("Forma-"+ i+ forma.toString() + "\n");
            i++;
        }

    }
}