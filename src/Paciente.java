public class Paciente extends Persona implements GestionCita{
    //Atributos
    private String idPaciente;
    //Relaciones
    private ExpedienteMedico expedienteMedico;
    private CitaMedica citaMedica;
    //Constructor
    public Paciente(String nombre, String cedula, String direccion, String idPaciente, CitaMedica citamedica){
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.idPaciente = idPaciente;
        this.citaMedica = citamedica;
    }
    //Metodos

    //Getters y Setters
    public String getIdPaciente() {return idPaciente;}
    //No hay set porque es solo de lectura

    public ExpedienteMedico getExpedienteMedico() {return expedienteMedico;}
    public void setExpedienteMedico(ExpedienteMedico expedienteMedico) {this.expedienteMedico = expedienteMedico;}

    public CitaMedica getCitaMedica() {return citaMedica;}
    public void setCitaMedica(CitaMedica citaMedica) {this.citaMedica = citaMedica;}



    @Override
    public void programarCita(){
    }
    @Override
    public void cancelarCita() {
    }
    @Override
    public void realizarCita() {
    }
}
