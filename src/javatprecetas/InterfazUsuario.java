/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatprecetas;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JSierra
 */
public class InterfazUsuario {
    private String pathDirectoryRecetas;
    private String pathDirectoryIngredientes;
    private Scanner scan = new Scanner(System.in);
            
    public InterfazUsuario(){
        System.out.println("*************************************************************");
        System.out.println("*                   INICIO DE PROGRAMA                      *");
        System.out.println("*************************************************************");
        System.out.println("*************************************************************");
        System.out.println("*Ingresar el directorio de archivos de recetas");
        pathDirectoryRecetas = scan.nextLine();
        System.out.println("*Ingresar el directorio de archivos de ingredientes");
        pathDirectoryIngredientes = scan.nextLine();
        System.out.println("*************************************************************");
    
    }
    
    public void IniciarLogica(){
        
        String confirmar;
        
        System.out.println("");
        System.out.println("Iniciar con el analisis de recetas vs ingredientes? (Y/N)");
        System.out.println("*************************************************************");
        confirmar = scan.nextLine();

        if((confirmar.equals("Y")) || (confirmar.equals("y"))){
            System.out.println("*************************************************************");
            OrganizadorRecetas cocina = new OrganizadorRecetas();
            try {
                cocina.arracarOrganizadorRecetas(pathDirectoryRecetas,pathDirectoryIngredientes);
                System.out.println("");
                System.out.println("Fin de programa");
            } catch (IOException ex) {
                Logger.getLogger(JavaTpRecetas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("*************************************************************");
            System.out.println("Fin de programa");
            System.out.println("*************************************************************");
        }
        
    }
}
