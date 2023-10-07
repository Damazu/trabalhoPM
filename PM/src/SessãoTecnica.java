import java.util.Date;
import java.sql.Time;

public class SessãoTecnica {
    private Date data;
    private Time horaInicio;
    private Time horaFim;
    private Sala sala;
    
    private static SessãoTecnica sTecnica = null;

    private SessãoTecnica(Date data, Time horaInicio, Time horaFim, Sala sala) {
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.sala = sala;
    }

    public static SessãoTecnica getTecnica(Date data, Time horaInicio, Time horaFim, Sala sala) {
        if (sTecnica == null) {
            sTecnica = new SessãoTecnica(data, horaInicio, horaFim, sala);
        }
        return sTecnica;
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

    public Sala getSala() {
        return sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }
}