public class Trabalho {
    private int id;
    private String titulo;
    private String resumo;

    public Trabalho(String titulo, String resumo){
        this.titulo = titulo;
        this.resumo = resumo;
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
