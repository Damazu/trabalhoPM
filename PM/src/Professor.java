import java.util.Scanner;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    private Minicurso turma;

    public Professor(String nome, String CPF, String especialidade, float salario){
        super(nome,CPF);
        this.salario = salario;
        this.especialidade = especialidade;
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



    public Professor cadastroProfessor(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("CPF: ");
        String CPF = sc.nextLine();

        System.out.println("especialidade: ");
        String especialidade = sc.nextLine();

        salario = 1800;

        sc.close();
        
        return new Professor(nome, CPF, especialidade, salario);
    }
}
