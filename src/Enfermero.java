public class Enfermero extends Persona {
    //Atributos
    private String idEnfermero;

    //Relaciones
    private CitaMedica citaMedica;

    //Constructor
    public Enfermero(String nombre, String cedula, String direccion, String idEnfermero, CitaMedica citamedica) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.idEnfermero = idEnfermero;
        this.citaMedica = citamedica;
    }
    //Metodos

    //Getters y Setters
    public String getIdEnfermero() {return idEnfermero;}
    //No hay set porque es solo de lectura

    public CitaMedica getCitaMedica() {return citaMedica;}
    public void setCitaMedica(CitaMedica citaMedica) {this.citaMedica = citaMedica;}


}

















