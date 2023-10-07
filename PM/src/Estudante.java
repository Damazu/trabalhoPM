import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Estudante extends Pessoa {
    private float nota;
    private int matricula;
    private Minicurso curso;

    private static Estudante estudante = null; // Instância única
    private static List<Estudante> estudantes = new ArrayList<Estudante>();

    private Estudante(String nome, String CPF, float nota, int matricula) {
        super(nome, CPF);
        this.nota = nota;
        this.matricula = matricula;
    }

    public static Estudante getestudante() {
        if (estudante == null) {
            estudante = new Estudante("", "", 0, 0);
        }
        return estudante;
    }

    public Estudante matricularEstudante() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("CPF: ");
        String cpf = sc.nextLine();

        System.out.println("Matricula: ");
        // Generate a random matrícula
        Random random = new Random();
        int matricula = random.nextInt(10000);
        System.out.println(matricula);

        nota = 0;

        Estudante estudante = new Estudante(nome, cpf, nota, matricula);
        estudantes.add(estudante);

        return estudante;
    }

    public void exibirInformacoes() {
        System.out.println("Informações dos Estudantes:");

        System.out.println("--------------------------------");
        for (Estudante estudante : estudantes) {
            System.out.println("Nome: " + estudante.getNome());
            System.out.println("CPF: " + estudante.getCPF());
            System.out.println("Nota: " + estudante.getNota());
            System.out.println("Matrícula: " + estudante.getMatricula());
            System.out.println("Curso: " + estudante.getCurso());
            System.out.println("--------------------------------");

        }
    }

    // Métodos getters e setters (para acessar e modificar os campos)

    public Float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Minicurso getCurso() {
        return curso;
    }

    public void setCurso(Minicurso curso) {
        this.curso = curso;
    }
}
