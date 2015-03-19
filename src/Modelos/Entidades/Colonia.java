package Modelos.Entidades;

/**
 * @author German AT
 */
public class Colonia {
    private int id;
    private int idCP;
    private String colonia;

    public Colonia(int id, int idCP, String colonia) {
        this.id = id;
        this.idCP = idCP;
        this.colonia = colonia;
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
     * @return the idCP
     */
    public int getIdCP() {
        return idCP;
    }
    /**
     * @param idCP the idCP to set
     */
    public void setIdCP(int idCP) {
        this.idCP = idCP;
    }
    /**
     * @return the colonia
     */
    public String getColonia() {
        return colonia;
    }
    /**
     * @param colonia the colonia to set
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
}
