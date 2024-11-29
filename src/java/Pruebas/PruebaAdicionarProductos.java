package Pruebas;

import Controlador.ProductosDAO;
import Modelo.Productos;
import java.util.Scanner;

public class PruebaAdicionarProductos {

    
    public static void main(String[] args) {
        // PRUEBA ADICIONAR EN LA BD
        
        ProductosDAO miproductosDAO = new ProductosDAO();
        Productos misproductos = new Productos();
        
        Scanner dato = new Scanner(System.in);
        
        String categoria = "";
        
        System.out.println("Por favor digite la marca ");
        categoria = dato.next();
        misproductos.setCategoria(categoria);
        String respuesta = miproductosDAO.adicionarProductos(misproductos);
        if(respuesta.length()==0){
            System.out.println("Registro exitoso");
        }else{
            System.out.println("Error al registrar" + respuesta);
        }
        
        
    }
    
}
