
package Modelo;



public class GeneradorDeMensajes {
    
    private int idGeneradorDeMensajes;
    private String plantillaMensaje;
    private int Cliente_idCliente;

    public int getIdGeneradorDeMensajes() {
        return idGeneradorDeMensajes;
    }

    public void setIdGeneradorDeMensajes(int idGeneradorDeMensajes) {
        this.idGeneradorDeMensajes = idGeneradorDeMensajes;
    }

    public String getPlantillaMensaje() {
        return plantillaMensaje;
    }

    public void setPlantillaMensaje(String plantillaMensaje) {
        this.plantillaMensaje = plantillaMensaje;
    }

    public int getCliente_idCliente() {
        return Cliente_idCliente;
    }

    public void setCliente_idCliente(int Cliente_idCliente) {
        this.Cliente_idCliente = Cliente_idCliente;
    }

}
