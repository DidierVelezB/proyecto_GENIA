package Controlador;

import java.sql.Connection;

/**
 *
 * @author USUARIO
 */
public class PruebaConexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion miconn = new Conexion();
        
        Connection reg = miconn.getConn();
    }
    
    
}
