import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Universidade extends Instituição {

    private List<Sala> salas;
    private List<Professor> professores;

    private static Universidade universidade;

    private Universidade(String nome, String CNPJ) {
        super(nome, CNPJ);
        this.salas = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public static Universidade getUniversidade() {
        if (universidade == null) {
            universidade = new Universidade("", "");
        }
        return universidade;
    }

    public Universidade cadastropUniversidade() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da universidade:");
        String nome = sc.next();
        System.out.println("Digite o CNPJ da universidade:");
        String cnpj = sc.next();
        universidade = new Universidade(nome, cnpj);
        
        return universidade;
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }
}