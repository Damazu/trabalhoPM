public abstract class Pessoa {
    private String nome;
    private String CPF;

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome,String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }

}
