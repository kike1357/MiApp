package miapp;

/**
 *
 * @author epastorizalorenzo
 */
public class Usuario {
    
    private String nombre, pass, id;
     public Usuario() {
        nombre=pass=id="";
    }

    public Usuario(String aux_nombre, String aux_pass, String aux_id) {
        this.nombre = aux_nombre;
        this.pass = aux_pass;
        this.id = aux_id;     
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String apellidos) {
        this.pass = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String telefono) {
        this.id = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", pass=" + pass + ", id=" + id + '}';
    }
    }
   
  

