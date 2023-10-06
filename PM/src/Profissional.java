public class Profissional extends Pessoa{
    private String cargo;
    private Float salario;

    public Profissional(String cargo,Float salario,String nome,String CPF){
        super(nome, CPF);
        this.cargo = cargo;
        this.salario = salario;
    }

    public Profissional cadastropProfissional(){
        String nome = "";
        String CPF = "";
        return new Profissional(cargo, salario, nome, CPF);
    }
    
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Float getSalario() {
        return salario;
    }
    public void setSalario(Float salario) {
        this.salario = salario;
    }

    

}
