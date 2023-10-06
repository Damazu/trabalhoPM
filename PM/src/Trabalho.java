public class Trabalho {
    private int id;
    private String titulo;
    private String resumo;
    private Professor professor;

    public Trabalho(String titulo, String resumo,Professor professor){
        this.titulo = titulo;
        this.resumo = resumo;
        this.professor = professor;
    }

    public Trabalho realizarTrabalho(){
        return new Trabalho(titulo, resumo, professor);
    }

    // Métodos getters e setters (para acessar e modificar os campos)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
