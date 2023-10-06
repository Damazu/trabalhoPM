import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int value = sc.nextInt();

        switch (value) {
            case 1:
                Estudante estudante = Estudante.getestudante(); // Obter a instância única

                estudante.matricularEstudante();
                estudante.exibirInformacoes();
                break;

            case 2:
                Professor professor = Professor.cadastroprofessor();

                professor.exibirInformacoes();
                break;

            case 3:
                Apresentação apresentação = new Apresentação(null);
                
                apresentação.agendarApresentação();
                break;

            case 9:
                Universidade universidade = Universidade.cadastropUniversidade();
                System.out.println("Nome da universidade: " + universidade.getNome());
                break;

            default:
                sc.close();
                break;
        }
    }
}