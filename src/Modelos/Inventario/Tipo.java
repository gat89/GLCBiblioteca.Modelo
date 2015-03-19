package Modelos.Inventario;

/**
 * @author German AT
 */
public class Tipo {
    private int id;
    private String Descripcion;

    public Tipo(int id, String Descripcion) {
        this.id = id;
        this.Descripcion = Descripcion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
