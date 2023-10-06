import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Apresentação {
    private Time horaApresentação;

    public Apresentação(Time horaAprensetação){
        this.horaApresentação = horaAprensetação;
    }
    
    public Apresentação agendarApresentação(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora da apresentação no formato HH:mm:ss: ");
        String horaString = sc.nextLine();

        // Formato da hora
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        try {
            // Converter a string para java.util.Date
            java.util.Date date = sdf.parse(horaString);

            // Criar um objeto java.sql.Time a partir do java.util.Date
            Time horaApresentacao = new Time(date.getTime());

            // Imprimir a hora da apresentação
            System.out.println("Hora da apresentação: " + horaApresentacao);

            return new Apresentação(horaApresentação);
        } catch (ParseException e) {
            System.out.println("Formato de hora inválido. Certifique-se de que está no formato HH:mm:ss.");
            return null;
        }
    }

    public static void apresentarTrabalho(Trabalho trabalho){
        String titulo = trabalho.getTitulo();
        String resumo = trabalho.getResumo();
        System.out.println(titulo);
        System.out.println(resumo);
    }
    
    public Time getHoraApresentação() {
        return horaApresentação;
    }
    public void setHoraApresentação(Time horaApresentação) {
        this.horaApresentação = horaApresentação;
    }
}
