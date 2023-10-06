import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    private SessãoTecnica turma;

    private static Professor professor = null;
    private static List<Professor> professores = new ArrayList<Professor>();

    private Professor(String nome, String CPF, String especialidade, float salario) {
        super(nome, CPF);
        this.salario = salario;
        this.especialidade = especialidade;
    }

    public static Professor cadastroprofessor() {
        if (professor == null) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("CPF: ");
            String CPF = sc.nextLine();

            System.out.println("Especialidade: ");
            String especialidade = sc.nextLine();

            float salario = 1800;

            professor = new Professor(nome, CPF, especialidade, salario);
            professores.add(professor);

            sc.close();
        }
        return professor;
    }

    public void exibirInformacoes() {
        System.out.println("Informações dos Professores: ");

        for (Professor professor : professores) {
            System.out.println("Nome: " + professor.getNome());
            System.out.println("CPF: " + professor.getCPF());
            System.out.println("Especialidade: " + professor.getEspecialidade());
            System.out.println("Salario: " + professor.getSalario());
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public SessãoTecnica getTurma() {
        return turma;
    }

    public void setTurma(SessãoTecnica turma) {
        this.turma = turma;
    }
}
