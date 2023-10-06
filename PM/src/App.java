import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int value = sc.nextInt();

        switch (value) {
            case 1:
                Estudante estudante = new Estudante("", "", 0, 0);

                estudante.matricularEstudante();
                estudante.exibirInformacoes();
                break;

            case 2:
                Professor professor = new Professor("", "", "", 0);

                professor.cadastroProfessor();
                professor.exibirInformacoes();
                break;

            case 3:
                Apresentação apresentacao = new Apresentação(null);
                
                apresentacao.agendarApresentação();

            default:
                sc.close();
                break;
        }

    }
}