public class Profissional {
    private String cargo;
    private Float salario;


    public Profissional(String cargo,Float salario){
        this.cargo = cargo;
        this.salario = salario;
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

        public Profissional cadastropProfissional(){
            return new Profissional(cargo, salario);
        }


}
