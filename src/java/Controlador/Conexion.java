package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexion {

    private Connection conn;
    private Statement stm;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String user = "root";
    private String password = "";
    private String basedatos = "GENIA";
    private String url = "jdbc:mysql://localhost:3306/" + basedatos + "?useTimezone=true&serverTimezone=UTC";

    public Conexion() {
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if (conn == null) {
                System.out.println("No se pudo hacer la conexion a " + url);
            } else {
                System.out.println("La conexión se estableció con " + basedatos);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public Connection getConn() {
        return conn;
    }

    // Método main para probar la conexión
    public static void main(String[] args) {
        Conexion conexion = new Conexion(); // Llama al constructor para intentar conectar
    }
}
