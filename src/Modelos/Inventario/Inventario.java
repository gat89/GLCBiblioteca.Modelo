package Modelos.Inventario;

/**
 * @author German AT
 */
public class Inventario {
    private int id;
    private int idCatalogo;
    private int idStatus;
    private String estadoF;
    private String Observaciones;

    public Inventario(int id, int idCatalogo, int idStatus, String estadoF, String Observaciones) {
        this.id = id;
        this.idCatalogo = idCatalogo;
        this.idStatus = idStatus;
        this.estadoF = estadoF;
        this.Observaciones = Observaciones;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(int idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public String getEstadoF() {
        return estadoF;
    }

    public void setEstadoF(String estadoF) {
        this.estadoF = estadoF;
    }
    
}
