import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
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