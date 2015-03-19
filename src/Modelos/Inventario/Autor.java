package Modelos.Inventario;

/**
 * @author German AT
 */
public class Autor {
    private int id;
    private String Autor;

    public Autor(int id, String Autor) {
        this.id = id;
        this.Autor = Autor;
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
     * @return the Autor
     */
    public String getAutor() {
        return Autor;
    }

    /**
     * @param Autor the Autor to set
     */
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
}
