public class Sala {
    private int codigo;
    private int idPredio;

    private Sala(int codigo, int idPredio){
        this.codigo = codigo;
        this.idPredio = idPredio;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getIdPredio() {
        return idPredio;
    }
    public void setIdPredio(int idPredio) {
        this.idPredio = idPredio;
    }
}
