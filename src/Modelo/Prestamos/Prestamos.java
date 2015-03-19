package Modelo.Prestamos;

import java.util.Date;

/**
 * @author German AT
 */
public class Prestamos {
    private int id;
    private int idConsulta;
    private int idStatus;
    private int idUsuario;
    private Date fechaProgramada;
    private Date fechaReal;
    private float saldo;

    public Prestamos(int id, int idConsulta, int idStatus, int idUsuario, Date fechaProgramada, Date fechaReal, float saldo) {
        this.id = id;
        this.idConsulta = idConsulta;
        this.idStatus = idStatus;
        this.idUsuario = idUsuario;
        this.fechaProgramada = fechaProgramada;
        this.fechaReal = fechaReal;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(Date fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public Date getFechaReal() {
        return fechaReal;
    }

    public void setFechaReal(Date fechaReal) {
        this.fechaReal = fechaReal;
    }
    
}
