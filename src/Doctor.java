public class Doctor extends Persona implements GestionCita {
    //Atributos
    private String idDoctor;
    //Relaciones
    private CitaMedica citaMedica;
    private Especialidad especialidad;
    //Constructor
    public Doctor(String nombre, String cedula, String direccion, String idDoctor){
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.idDoctor = idDoctor;
    }
    public Doctor(String nombre, String cedula, String direccion, String idDoctor, CitaMedica citaMedica, Especialidad especialidad){
        this(nombre, cedula, direccion, idDoctor);
        this.citaMedica = citaMedica;
        this.especialidad = especialidad;
    }
    //Metodos

    //Getters y Setters
    public String getIdDoctor() {return idDoctor;}
    //No hay set porque es solo de lectura

    public CitaMedica getCitaMedica() {return citaMedica;}
    public void setCitaMedica(CitaMedica citaMedica) {this.citaMedica = citaMedica;}

    public Especialidad getEspecialidad() {return especialidad;}
    public void setEspecialidad(Especialidad especialidad) {this.especialidad = especialidad;}


    @Override
    public void programarCita() {
    }
    @Override
    public void cancelarCita() {
    }
    @Override
    public void realizarCita() {
    }
}
