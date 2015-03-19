package Modelos.Entidades;

/**
 * @author German AT
 */
public class Estados {
    private int id;
    private String estado;
    
    public Estados(int id,String estado){
        this.id=id;
        this.estado=estado;
    }
    
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    
    public String Estado(){
        return this.estado;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
}
