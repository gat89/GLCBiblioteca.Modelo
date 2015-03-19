package Modelo.Prestamos;

import java.util.Date;

/**
 * @author German AT
 */
public class Consulta {
    private int id;
    private int idInventario;
    private Date fecha;
    private String estadoR;

    public Consulta(int id, int idInventario, Date fecha, String estadoR) {
        this.id = id;
        this.idInventario = idInventario;
        this.fecha = fecha;
        this.estadoR = estadoR;
    }

    public String getEstadoR() {
        return estadoR;
    }

    public void setEstadoR(String estadoR) {
        this.estadoR = estadoR;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
