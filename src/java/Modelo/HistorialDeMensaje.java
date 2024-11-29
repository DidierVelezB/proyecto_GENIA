
package Modelo;



public class HistorialDeMensaje {

    
    private int idHistorialDeMensaje;
    private String mensajeEnviado;
    private int Cliente_idCliente;
    
    public int getIdHistorialDeMensaje() {
        return idHistorialDeMensaje;
    }

    public void setIdHistorialDeMensaje(int idHistorialDeMensaje) {
        this.idHistorialDeMensaje = idHistorialDeMensaje;
    }

    public String getMensajeEnviado() {
        return mensajeEnviado;
    }

    public void setMensajeEnviado(String mensajeEnviado) {
        this.mensajeEnviado = mensajeEnviado;
    }

    public int getCliente_idCliente() {
        return Cliente_idCliente;
    }

    public void setCliente_idCliente(int Cliente_idCliente) {
        this.Cliente_idCliente = Cliente_idCliente;
    }
    
    
}
