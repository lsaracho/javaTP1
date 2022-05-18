/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatprecetas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JSierra
 */
public class ObtenerArchivo {
    private BufferedReader csvRecetas = null;
    private BufferedReader csvIngredientes = null;
    
    //Contructor        
    public void ObtenerArchivo(String pathRecetas, String pathIngredientes){        
        try {
            csvRecetas = new BufferedReader(new FileReader(pathRecetas));
            csvIngredientes = new BufferedReader(new FileReader(pathIngredientes));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObtenerArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
