import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    private Minicurso turma;

    public Professor(String nome, String CPF, String especialidade, float salario){
        super(nome,CPF);
        this.salario = salario;
        this.especialidade = especialidade;
    }

    List<Professor> professores = new ArrayList<Professor>();

    public Professor cadastroProfessor(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("CPF: ");
        String CPF = sc.nextLine();

        System.out.println("especialidade: ");
        String especialidade = sc.nextLine();

        salario = 1800;

        Professor professor = new Professor(nome, CPF, especialidade, salario);
        professores.add(professor);
        
        return professor;
    }

    public void exibirInformacoes() {
        System.out.println("Informações dos Profesores: ");

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
    public Minicurso getTurma() {
        return turma;
    }
    public void setTurma(Minicurso turma) {
        this.turma = turma;
    }

}
