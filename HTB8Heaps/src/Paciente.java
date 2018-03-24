
/**
 * Clase Paciente
 *
 * @author Jose Tejada 17584
 * @author David Soto 17551
 * @version 1.0
 */
public class Paciente implements Comparable<Paciente> {

    /*Atributos*/
    private String nombre;
    private String descripcion;
    private String codigoDeEmergencia;

    /**
     * Constructor de la clase Paciente
     *
     * @param nombre es el nombre del paciente
     * @param descripcion es la descripcion de la dolencia
     * @param codigoDeEmergencia es el codigo
     */
    public Paciente(String nombre, String descripcion, String codigoDeEmergencia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigoDeEmergencia = codigoDeEmergencia;
    }

    /**
     * Este metodo edita el toString
     *
     * @return un STring ordenado
     */
    @Override
    public String toString() {

        return this.getNombre() + " |  " + this.getDescripcion() + " | " + this.getCodigoDeEmergencia();
    }

    /**
     * compara los codigos de emergencia
     *
     * @param p un paciente
     * @return un entero
     */
    @Override
    public int compareTo(Paciente p) {

        return this.getCodigoDeEmergencia().compareTo(p.getCodigoDeEmergencia());
    }

    /**
     * Acá se encuentran los gets y sets
     *
     * @return un String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setea el nombe
     *
     * @param nombre un string con el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * obtenemos el codigo
     *
     * @return un string
     */
    public String getCodigoDeEmergencia() {
        return codigoDeEmergencia;
    }

    /**
     * seteamos el codigo
     *
     * @param codigoDeEmergencia un string
     */
    public void setCodigoDeEmergencia(String codigoDeEmergencia) {
        this.codigoDeEmergencia = codigoDeEmergencia;
    }

    /**
     * obetenemos la descripcio
     *
     * @return un string
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * seteamos la descripcion
     *
     * @param descripcion un string
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
