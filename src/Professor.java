import java.util.ArrayList;
public class Professor {
    static ArrayList<Professor> professores= new ArrayList<>();

    private String senha;

    public Professor(String senha){
        this.senha=senha;
    }

    public static Professor verificadorSenha(String senha) {
        for (Professor professor : professores) {
            if (professor.senha.equals(senha)) {
                return professor;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "-Professor-" +
                "\nSenha='" + senha;
    }
}
