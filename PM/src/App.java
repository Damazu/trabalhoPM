import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List; // Importe a classe List

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudante estudante = Estudante.getestudante();
        Professor professor = Professor.getProfessor();
        Profissional profissional = Profissional.getProfissional();
        Universidade universidade = Universidade.getUniversidade();
        Empresa empresa = Empresa.getEmpresa();
        List<Professor> listaProfessores = new ArrayList<>();
        List<Estudante> listaEstudantes = new ArrayList<>();

        while (true) {
            System.out.println("1.Cadastros");
            System.out.println("2.Exibição");
            System.out.println("0.Encerrar Programa");
            boolean repete = true;
            int value = sc.nextInt();

            switch (value) {
                case 1:
                    while (repete) {
                        System.out.println("1.Cadastro de Estudante");
                        System.out.println("2.Cadastro Professor");
                        System.out.println("3.Cadastro Profissional");
                        System.out.println("4.Cdastro de Empresa");
                        System.out.println("5.Cadastro do trabalho");
                        System.out.println("5.Cadastro de Universidade");
                        System.out.println("0.Voltar");

                        value = sc.nextInt();
                        switch (value) {
                            case 1:
                                estudante.matricularEstudante();
                                break;
                            case 2:
                                professor.cadastroprofessor();
                                break;
                            case 3:
                                profissional.cadastroprofissional();
                                break;
                            case 4:
                                empresa.cadastrarEmpresa();
                                break;
                            case 5:
                                universidade.cadastropUniversidade();
                                break;
                            case 6:
                                Trabalho.cadastroTrabalho(listaProfessores,listaEstudantes);
                                break;
                            case 7:
                                Apresentação.agendarApresentação();
                                break;
                            case 0:
                                repete = false;
                                break;
                            default:
                                System.out.println("Invalido");
                                break;
                        }
                    }
                case 2:
                    while (repete) {
                        System.out.println("1.Exibir Estudantes");
                        System.out.println("2.Exibir Professores");
                        System.out.println("3.Cadastro Profissional");
                        value = sc.nextInt();
                        switch (value) {
                            case 1:
                                estudante.exibirInformacoes();
                                break;

                            case 2:
                                professor.exibirInformacoes();
                                break;

                            
                            case 0:
                                repete = false;
                                break;
                            default:
                                break;

                        }
                    }

                case 0:
                    System.out.println("Programa Finalizado.");
                    sc.close();
                    System.exit(0); // Encerre o programa
                    break;

                default:
                    System.out.println("Invalido");
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