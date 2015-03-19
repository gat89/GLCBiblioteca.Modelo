package Modelos.Usuarios;

import java.util.Date;

/**
 * @author German AT
 */
public class Usuario {
    private String usrID;
    private String pw;
    private Date ingreso;
    private int idPersona;
    private int idNivel;
    private int Status;

    public Usuario(String usrID, String pw, Date ingreso, int idPersona, int idNivel, int Status) {
        this.usrID = usrID;
        this.pw = pw;
        this.ingreso = ingreso;
        this.idPersona = idPersona;
        this.idNivel = idNivel;
        this.Status = Status;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public String getUsrID() {
        return usrID;
    }

    public void setUsrID(String usrID) {
        this.usrID = usrID;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }
    
}
