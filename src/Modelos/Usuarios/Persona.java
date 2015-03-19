package Modelos.Usuarios;

import java.util.Date;

/**
 * @author German AT
 */
public class Persona {
    private int id;
    private int idDireccion;
    private String nombre;
    private String apellido1;
    private String spellido2;
    private String telefono;
    private Date nacimiento;

    public Persona(int id, int idDireccion, String nombre, String apellido1, String spellido2, String telefono, Date nacimiento) {
        this.id = id;
        this.idDireccion = idDireccion;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.spellido2 = spellido2;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getSpellido2() {
        return spellido2;
    }

    public void setSpellido2(String spellido2) {
        this.spellido2 = spellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
