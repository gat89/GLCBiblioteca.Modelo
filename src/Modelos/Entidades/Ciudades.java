package Modelos.Entidades;

/**
 * @author German AT
 */
public class Ciudades {
    private int id;
    private int idEstado;
    private String ciudad;

    public Ciudades(int id, int idEstado,String ciudad){
        this.id=id;
        this.idEstado=idEstado;
        this.ciudad=ciudad;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdEstado() {
        return idEstado;
    }
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
