public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    private Minicurso turma;

    public Professor(String especialidade, float salario, Minicurso turma){
        this.turma = turma;
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



    public Profissional cadastropProfissional(){
        return new Profissional(especialidade, null,null);
    }
}
