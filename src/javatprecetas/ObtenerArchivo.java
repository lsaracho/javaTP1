/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatprecetas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;


/**
 *
 * @author JSierra
 */
public class ObtenerArchivo {
    private BufferedReader csvRecetas = null;
    private BufferedReader csvIngredientes = null;

    
    //Contructor        
    public ObtenerArchivo(String pathRecetas, String pathIngredientes){        
        try {
            csvRecetas = new BufferedReader(new FileReader(pathRecetas));
            csvIngredientes = new BufferedReader(new FileReader(pathIngredientes));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObtenerArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Ingrediente> ConvertirPathIngredientes(){
        
        String row;
        //Ingrediente listaIngredientes2[];
        ArrayList<Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();

                
        try {
            while ((row = this.csvIngredientes.readLine()) != null){
                String[] data = row.split(";");
                
                /*System.out.println(row);
                for(int i=0; i < data.length;i++)
                    System.out.println(i+":"+data[i]);
                */
                
                Ingrediente ingredienteAux = new Ingrediente(data[0], data[1], Integer.parseInt(data[2]));
                
                listaIngredientes.add(ingredienteAux);                 
            }
             this.csvIngredientes.close();
             
             
        } catch (IOException ex) {
            Logger.getLogger(ObtenerArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        /*for(int j=0; j < listaIngredientes.size(); j++){
            System.out.println(j+":"+listaIngredientes.get(j).getNombre());  
        
        }*/
        
        
        return listaIngredientes;
    }
    
}
