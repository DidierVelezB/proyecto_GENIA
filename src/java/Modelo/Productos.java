
package Modelo;

public class Productos {
    
    private int idProductos;
    private String nombre;
    private String descripcion;
    private String categoria;
    private int Intereses_idIntereses;
    
    public int getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(int idProductos) {
        this.idProductos = idProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getIntereses_idIntereses() {
        return Intereses_idIntereses;
    }

    public void setIntereses_idIntereses(int Intereses_idIntereses) {
        this.Intereses_idIntereses = Intereses_idIntereses;
    }
    
    
    
}
