package Modelos.Entidades;

/**
 * @author German AT
 */
public class CP {
    private int id;
    private int idCiudad;

    public CP(int id, int idCiudad) {
        this.id = id;
        this.idCiudad = idCiudad;
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
     * @return the idCiudad
     */
    public int getIdCiudad() {
        return idCiudad;
    }
    /**
     * @param idCiudad the idCiudad to set
     */
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
}
