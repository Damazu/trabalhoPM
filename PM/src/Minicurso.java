import java.util.Date;
import java.sql.Time;

import java.util.List;

class Minicurso {
    private Date data;
    private Time horaInicio;
    private Time horaFim;
    private List<Pessoa> participantes;

    public Minicurso(Date data, Time horaInicio, Time horaFim, Sala sala) {
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;

    }

    // Métodos para adicionar e remover participantes
    public void adicionarParticipante(Pessoa pessoa) {
        participantes.add(pessoa);
    }

    public void removerParticipante(Pessoa pessoa) {
        participantes.remove(pessoa);
    }

    // Getters e Setters para data, horaInicio e horaFim
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Time horaFim) {
        this.horaFim = horaFim;
    }

    // Getter para a lista de participantes
    public List<Pessoa> getParticipantes() {
        return participantes;
    }
}