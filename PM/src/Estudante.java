import java.sql.Time;
import java.util.Date;

public class Estudante {
    private float nota;
    private int matricula;
    private Minicurso curso;

      public Estudante(float nota, int matricula, Minicurso curso) {
        this.nota = nota;
        this.matricula = matricula;
        this.curso = curso;
    }

     // Métodos getters e setters (para acessar e modificar os campos)
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

    public Estudante matricularEstudante(){

        return new Estudante(nota, matricula, curso);
    }
    public void realizarTrabalho(){}

    public void apresentarTrabalho(){}

}
