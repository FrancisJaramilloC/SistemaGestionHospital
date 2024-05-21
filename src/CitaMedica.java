import java.util.Date;

public class CitaMedica {
    //Atributos
    private Date fecha;
    private String hora;
    private String motivoCita;
    private static int contadorCitas = 0;
    //Relaciones
    private Doctor doctor;
    private Paciente paciente;
    private Enfermero enfermero;
    private Estado estado;
    //Constructor
    public CitaMedica(Date fecha, String hora, String motivoCita){
        this.fecha = fecha;
        this.hora = hora;
        this.motivoCita = motivoCita;
    }
    public CitaMedica(Date fecha, String hora, String motivoCita, Doctor doctor, Paciente paciente, Enfermero enfermero, Estado estado){
        this(fecha, hora, motivoCita);
        this.doctor = doctor;
        this.paciente = paciente;
        this.enfermero = enfermero;
        this.estado = estado;
        contadorCitas++;
    }
    //Métodos

    //Getters y Setters
    public Date getFecha() {return fecha;}
    public void setFecha(Date fecha) {this.fecha = fecha;}

    public String getHora() {return hora;}
    public void setHora(String hora) {this.hora = hora;}

    public String getMotivoCita() {return motivoCita;}
    public void setMotivoCita(String motivoCita) {this.motivoCita = motivoCita;}

    public Doctor getDoctor() {return doctor;}
    public void setDoctor(Doctor doctor) {this.doctor = doctor;}

    public Paciente getPaciente() {return paciente;}
    public void setPaciente(Paciente paciente) {this.paciente = paciente;}

    public Enfermero getEnfermero() {return enfermero;}
    public void setEnfermero(Enfermero enfermero) {this.enfermero = enfermero;}

    public Estado getEstado() {return estado;}
    public void setEstado(Estado estado) {this.estado = estado;}

    @Override
    public String toString() {
        return "CitaMedica{" +
                "fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", motivoCita='" + motivoCita + '\'' +
                ", doctor=" + doctor +
                ", paciente=" + paciente +
                ", enfermero=" + enfermero +
                ", estado=" + estado +
                '}';
    }
}
