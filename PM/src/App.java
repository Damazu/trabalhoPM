import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

       switch (value) {
        case 1:
                Estudante estudante = Estudante.matricularEstudante(0, sc);
                System.out.println("Nome: " + estudante.getNome());
            break;
       
        default:
            sc.close();
            break;
       }

    }
}