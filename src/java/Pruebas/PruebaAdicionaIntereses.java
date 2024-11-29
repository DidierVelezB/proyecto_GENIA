package Pruebas;

import Controlador.InteresesDAO;
import Modelo.Intereses;
import java.util.Scanner;

public class PruebaAdicionaIntereses {
    
    
    public static void main(String[] args) {
        // PRUEBA ADICIONAR EN LA BD
        
        InteresesDAO miinteresDAO = new InteresesDAO();
        Intereses miinteres = new Intereses();
        
        Scanner dato = new Scanner(System.in);
        
        String nombre = "";
        
        System.out.println("Por favor digite la marca ");
        nombre = dato.next();
        miinteres.setNombre(nombre);
        String respuesta = miinteresDAO.adicionarIntereses(miinteres);
        if(respuesta.length()==0){
            System.out.println("Registro exitoso");
        }else{
            System.out.println("Error al registrar" + respuesta);
        }
        
        
    }
    
}

