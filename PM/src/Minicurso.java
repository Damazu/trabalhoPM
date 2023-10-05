import java.util.Date;
import java.sql.Time;

public class Minicurso {
    private Date data;
    private Time horaInicio;
    private Time horaFim;

    public Minicurso(Date data, Time horainicio, Time horaFim) {
        this.data = data;
        this.horaInicio = horainicio;
        this.horaFim = horaFim;
    }

        // Métodos getters e setters (para acessar e modificar os campos)
        public Date getData() {
            return data;
        }
    
        public void setData(Date data) {
            this.data = data;
        }
    
        public Time getHorainicio() {
            return horaInicio;
        }
    
        public void setHorainicio(Time horainicio) {
            this.horaInicio = horainicio;
        }
    
        public Time getHoraFim() {
            return horaFim;
        }
    
        public void setHoraFim(Time horaFim) {
            this.horaFim = horaFim;
        }
    
}
