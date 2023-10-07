import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa extends Instituição {
    private List<Profissional> profissionais;

    private static Empresa instanciaUnica = null;

    private Empresa(String nome, String CNPJ) {
        super(nome, CNPJ);
        this.profissionais = new ArrayList<>();
    }

    public static Empresa getInstance() {
        if (instanciaUnica == null) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o nome da empresa:");
            String nome = sc.next();

            System.out.println("Digite o CNPJ da empresa:");
            String cnpj = sc.next();

            instanciaUnica = new Empresa(nome, cnpj);
            sc.close();
        }
        return instanciaUnica;
    }

    public void adicionarProfissional(Profissional profissional) {
        profissionais.add(profissional);
    }

    public Profissional selecionarProfissional() {
        Scanner sc = new Scanner(System.in);

        if (profissionais.isEmpty()) {
            System.out.println("Nenhum profissional cadastrado na empresa.");
            return null;
        }

        System.out.println("Selecione um profissional da lista: ");
        for (int i = 0; i < profissionais.size(); i++) {
            System.out.println((i + 1) + ". " + profissionais.get(i).getNome());
        }

        int escolha = sc.nextInt();
        sc.nextLine(); // Limpar o buffer de entrada

        if (escolha < 1 || escolha > profissionais.size()) {
            System.out.println("Escolha inválida.");
            return null;
        }

        return profissionais.get(escolha - 1);
    }

    public List<Profissional> getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(List<Profissional> profissionais) {
        this.profissionais = profissionais;
    }
}