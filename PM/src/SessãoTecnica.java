import java.sql.Date;
import java.sql.Time;

public class SessãoTecnica {
    private Date data;
    private Time horaInicio;
    private Time horaFim;

    public SessãoTecnica(Date data, Time horaInicio,Time horaFim){
        this.data= data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Time getHoraFim() {
        return horaFim;
    }
    public void setHoraFim(Time horaFim) {
        this.horaFim = horaFim;
    }
    public Time getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }
}
