import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();

       switch (value) {
        case 1:
                Estudante estudante = Estudante.matricularEstudante(0);
                
                System.out.println("Nome: " + estudante.getNome());
            break;
       
        default:
            scan.close();
            break;
       }

    }
}