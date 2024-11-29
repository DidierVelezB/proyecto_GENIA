
package Controlador;

import Modelo.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductosDAO {
    
    public String adicionarProductos(Productos miproductos){
        
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try{
            String Query = "INSERT INTO Productos(categoria)"
                    + "VALUES(?);";
            
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, miproductos.getCategoria());
            sentencia.execute();
            miRespuesta = "";
                    
                    
        }catch(Exception ex){
            miRespuesta = ex.getMessage();
            System.out.println("Ocurrio un error en ProductosDAO "+ ex.getMessage());
        }
    return miRespuesta;
        
    }
    public Productos consultarProductos (int IdProductos){
        Productos producto = null;       
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();  
        try{
            Statement sentencia = nuevaCon.createStatement();
            String QuerySQL = "select idProductos,nombre from Productos where idProductos="+idProductos;
            ResultSet rs = sentencia.executeQuery(QuerySQL);
            while (rs.next()) {
                producto = new Productos();
                producto.setIdProductos(rs.getInt(1));
                producto.setNombre(rs.getString(2));       
        }
         return producto;
        }catch (Exception ex){
            System.err.println(ex.getMessage());
            return producto;
        }
    }
    
}
