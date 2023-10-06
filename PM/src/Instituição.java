public abstract class Instituição {
    private String CNPJ;
    private String nome;
    
    public Instituição(String nome,String CNPJ){
        this.nome = nome;
        this.CNPJ = CNPJ;
    }
    
    public String getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }   
}
