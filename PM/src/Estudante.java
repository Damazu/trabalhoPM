import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class Estudante extends Pessoa{
    private float nota;
    private int matricula;
    private Minicurso curso;

    public Estudante(String nome, String CPF, float nota, int matricula, Minicurso curso) {
        super(nome,CPF);
        this.nota = nota;
        this.matricula = matricula;
        this.curso = curso;
    }

    Scanner sc = new Scanner(System.in);

    public Estudante matricularEstudante(){
        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("CPF: ");
        String cpf = sc.nextLine();

        nota = 0;

        System.out.println("Matricula: ");
        int matricula = sc.nextInt();

        curso = null;

        return new Estudante(nome, cpf, nota, matricula, curso);

        
    }

    public void exibirInformacoes() {
        System.out.println("Informações do Estudante:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Nota: " + nota);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }

    //Métodos getters e setters (para acessar e modificar os campos)

    public Float getnota() {
        return nota;
    }

    public void setnota(float nota) {
        this.nota = nota;
    }

    public int getmatricula() {
        return matricula;
    }

    public void setmatricula(int matricula) {
        this.matricula = matricula;
    }

    public Minicurso getcurso() {
        return curso;
    }

    public void setcurso(Minicurso curso) {
        this.curso = curso;
    }


}
