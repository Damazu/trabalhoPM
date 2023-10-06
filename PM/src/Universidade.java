import java.util.ArrayList;
import java.util.List;

public class Universidade extends Instituição{

    private List<Sala> salas;
    private List<Professor> professores;

    public Universidade(String nome, String CNPJ){
        super(nome, CNPJ);
        this.salas = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public List<Professor> getProfessores() {
        return professores;
    }
    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
    public List<Sala> getSalas() {
        return salas;
    }
    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    public Universidade cadastropUniversidade(){
        String nome = "";
        String CNPJ = "";
        return new Universidade(nome,CNPJ);
    }
}
