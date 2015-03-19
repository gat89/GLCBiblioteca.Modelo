package Modelos.Inventario;

import Abstractas.Movimientos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * @author German AT
 */
public class Catalogo extends Movimientos{
    private int id;
    private Date fEdicion;
    private int idAutor;
    private int idEditorial;
    private int idTipo;
    private String ISBN;
    private int nEdicion;
    private String Titulo;

    public Catalogo(int id) {
        
    }
    public Catalogo(Date fEdicion,int idAutor, int idEditorial,int idTipo,String ISBN, int nEdicion,String titulo){
        this.fEdicion=fEdicion;
        this.idAutor=idAutor;
        this.idEditorial=idEditorial;
        this.idTipo=idTipo;
        this.ISBN=ISBN;
        this.nEdicion=nEdicion;
        this.Titulo=titulo;
    }

    //<editor-fold defaultstate="collapsed" desc="Setters & Getters">
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getfEdicion() {
        return fEdicion;
    }

    public void setfEdicion(Date fEdicion) {
        this.fEdicion = fEdicion;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getnEdicion() {
        return nEdicion;
    }

    public void setnEdicion(int nEdicion) {
        this.nEdicion = nEdicion;
    }
    //</editor-fold>

    
    
    @Override
    public boolean Insertar(String consulta, String parametros) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Actualizar(String consulta, String parametros) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Eliminar(String consulta, int[] id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet Consultar(String consulta) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
