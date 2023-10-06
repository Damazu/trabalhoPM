import java.util.ArrayList;
import java.util.List;

public class Empresa extends Instituição{
    private List<Profissional> Profissionals;

    public Empresa(String nome, String CNPJ){
        super(nome, CNPJ);
        this.Profissionals = new ArrayList<>();
        
    }

    public List<Profissional> getProfissionals() {
        return Profissionals;
    }
    public void setProfissionals(List<Profissional> Profissionals) {
        this.Profissionals = Profissionals;
    }
}
