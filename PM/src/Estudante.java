import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class Estudante extends Pessoa{
    private float nota;
    private int matricula;
    private Minicurso curso;

    private Estudante(String nome, String CPF, float nota, int matricula) {
        super(nome,CPF);
        this.nota = nota;
        this.matricula = matricula;
        // this.curso = curso;
    }



    public static Estudante matricularEstudante(int nota){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("CPF: ");
        String cpf = sc.nextLine();

        System.out.println("Matricula: ");
        int matricula = sc.nextInt();

        return new Estudante(nome, cpf, nota, matricula);
    
    }

    public void exibirInformacoes() {
        System.out.println("Informações do Estudante:");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("Nota: " + getnota());
        System.out.println("Matrícula: " + getmatricula());
        System.out.println("Curso: " + getcurso());
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
