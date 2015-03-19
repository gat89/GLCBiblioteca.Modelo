package Modelos.Entidades;

/**
 * @author German AT
 */
public class Direccion {
    private int id;
    private int idColonia;
    private String calle;
    private String numero;
    String nuneroInt;

    public Direccion(int id, int idColonia, String calle, String numero, String nuneroInt) {
        this.id = id;
        this.idColonia = idColonia;
        this.calle = calle;
        this.numero = numero;
        this.nuneroInt = nuneroInt;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the idColonia
     */
    public int getIdColonia() {
        return idColonia;
    }
    /**
     * @param idColonia the idColonia to set
     */
    public void setIdColonia(int idColonia) {
        this.idColonia = idColonia;
    }
    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }
    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }
    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }
    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
}
