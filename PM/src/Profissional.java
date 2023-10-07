import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Profissional extends Pessoa {
    private String especialidade;
    private float salario;
    private SessãoTecnica turma;

    private static Profissional profissional = null;
    private static List<Profissional> Profissionales = new ArrayList<Profissional>();

    private Profissional(String nome, String CPF, String especialidade, float salario) {
        super(nome, CPF);
        this.salario = salario;
        this.especialidade = especialidade;
    }

    public static Profissional getProfissional() {
        if (profissional == null) {
            profissional = new Profissional("", "", "", 0);
        }
        return profissional;
    }

    public Profissional cadastroprofissional() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("CPF: ");
        String CPF = sc.nextLine();

        System.out.println("Especialidade: ");
        String especialidade = sc.nextLine();

        float salario = 1800;

        profissional = new Profissional(nome, CPF, especialidade, salario);
        Profissionales.add(profissional);

        return profissional;
    }

    public void exibirInformacoes() {
        System.out.println("Informações dos Profissionales: ");

        System.out.println("--------------------------------");
        for (Profissional Profissional : Profissionales) {
            System.out.println("Nome: " + Profissional.getNome());
            System.out.println("CPF: " + Profissional.getCPF());
            System.out.println("Especialidade: " + Profissional.getEspecialidade());
            System.out.println("Salario: " + Profissional.getSalario());
            System.out.println("--------------------------------");
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
