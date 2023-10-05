import java.sql.Time;

public class Apresentação {
    private Time horaApresentação;

    public Apresentação(Time horaAprensetação){
        this.horaApresentação = horaAprensetação;
    }
    
    
    public Time getHoraApresentação() {
        return horaApresentação;
    }
    public void setHoraApresentação(Time horaApresentação) {
        this.horaApresentação = horaApresentação;
    }
}
