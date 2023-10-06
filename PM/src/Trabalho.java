import java.util.Scanner;

public class Trabalho {
    private int id;
    private String titulo;
    private String resumo;
    private Professor professor;

    public Trabalho(String titulo, String resumo, Professor professor){
        this.titulo = titulo;
        this.resumo = resumo;
        this.professor = professor;
    }


    public static Trabalho realizarTrabalho(){
        Scanner sc = new Scanner(System.in);
        Professor professor = new Professor("", "", "", 0);
        
        professor.getNome();

        System.out.println("Titulo: ");
        String titulo = sc.nextLine();

        System.out.println("Resumo: ");
        String resumo = sc.nextLine();

        return new Trabalho(titulo, resumo, professor);
    }

    // public static void notaEstudante(nomeEstudante){
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Digite a nota do trabalho: ");
    //     Float nota = sc.nextFloat();

    // }

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
