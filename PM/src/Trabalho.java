import java.util.Scanner;
import java.util.List;

public class Trabalho {
    private int id;
    private String titulo;
    private String resumo;
    private Pessoa pessoa;

    private static Trabalho trabalho = null;

    private Trabalho(String titulo, String resumo, Pessoa pessoa) {
        this.titulo = titulo;
        this.resumo = resumo;
        this.pessoa = pessoa;
    }

    public static Trabalho cadastroTrabalho(List<Professor> professores, List<Estudante> estudantes) {
        if (trabalho == null) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Selecione uma pessoa (1 - Professor, 2 - Estudante): ");
            int escolha = sc.nextInt();
            sc.nextLine(); // Limpar o buffer de entrada

            if (escolha == 1) {
                System.out.println("Selecione um professor: ");
                for (int i = 0; i < professores.size(); i++) {
                    System.out.println((i + 1) + ". " + professores.get(i).getNome());
                }

                int escolhaProfessor = sc.nextInt();
                if (escolhaProfessor < 1 || escolhaProfessor > professores.size()) {
                    System.out.println("Escolha inválida.");
                    return null;
                }

                Professor professorSelecionado = professores.get(escolhaProfessor - 1);

                System.out.println("Titulo: ");
                sc.nextLine(); // Limpar o buffer de entrada
                String titulo = sc.nextLine();

                System.out.println("Resumo: ");
                String resumo = sc.nextLine();

                trabalho = new Trabalho(titulo, resumo, professorSelecionado);
            } else if (escolha == 2) {
                System.out.println("Selecione um estudante: ");
                for (int i = 0; i < estudantes.size(); i++) {
                    System.out.println((i + 1) + ". " + estudantes.get(i).getNome());
                }

                int escolhaEstudante = sc.nextInt();
                if (escolhaEstudante < 1 || escolhaEstudante > estudantes.size()) {
                    System.out.println("Escolha inválida.");
                    return null;
                }

                Estudante estudanteSelecionado = estudantes.get(escolhaEstudante - 1);

                System.out.println("Titulo: ");
                sc.nextLine(); // Limpar o buffer de entrada
                String titulo = sc.nextLine();

                System.out.println("Resumo: ");
                String resumo = sc.nextLine();

                trabalho = new Trabalho(titulo, resumo, estudanteSelecionado);
            } else {
                System.out.println("Escolha inválida.");
                return null;
            }

            sc.close();
        }

        return trabalho;
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