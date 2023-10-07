import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudante estudante = Estudante.getestudante();
        Professor professor = Professor.getProffisonal();
        Apresentação apresentação = new Apresentação(null);
        Universidade universidade = Universidade.getUniversidade();

        while (true) {
            System.out.println("1.Matricular Estudante");
            System.out.println("2.Exibir Estudantes");
            System.out.println("3.Cadastrar Professor");
            System.out.println("4.Exibir Professores");
            System.out.println("5.");
            System.out.println("6.");
            System.out.println("7.");
            System.out.println("8.");
            System.out.println("0.Encerrar Programa");

            int value = sc.nextInt();

            switch (value) {
                case 1:
                    estudante.matricularEstudante();
                    break;

                case 2:
                    estudante.exibirInformacoes();
                    break;

                case 3:
                    professor.cadastroprofessor();
                    break;

                case 4:
                    professor.exibirInformacoes();
                    break;

                case 5:
                    apresentação.agendarApresentação();
                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9:
                    System.out.println("Nome da universidade: " + universidade.getNome());
                    break;

                case 0:
                    System.out.println("Programa Finalizado.");
                    System.exit(0); // Encerre o programa

                default:
                    sc.close();
                    break;
            }

            System.out.println("\nPressione Enter para voltar ao menu...");
            sc.nextLine(); // Limpar o buffer do scanner
            sc.nextLine(); // Aguardar pressionar Enter para continuar

            // Limpar a tela
            clearScreen();
        }
    }

    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            // Tratar exceções, se necessário
            e.printStackTrace();
        }
    }
}