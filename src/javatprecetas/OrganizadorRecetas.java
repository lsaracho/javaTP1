/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatprecetas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VTCLUSAR
 */
public class OrganizadorRecetas {
    
    public void arracarOrganizadorRecetas(String pathRecetas,String pathIngredientes){
    
    ObtenerArchivo archivo = new ObtenerArchivo(pathRecetas, pathIngredientes);
    ArrayList<Receta> listaRecetasEvaluar = archivo.ConvertirPathRecetas();
    ArrayList<Ingrediente> listaIngredientesDisponibles = archivo.ConvertirPathIngredientes();
    this.RecetasPosibles(listaRecetasEvaluar, listaIngredientesDisponibles);
    
    }
    

       public  void RecetasPosibles(ArrayList<Receta> listaRecetasEvaluar, ArrayList<Ingrediente> listaIngredientesDisponibles){
        boolean posible = false;
        for(int i = 0; i < listaRecetasEvaluar.size(); i++){            
            //si no encontró, devuelvo falso
            if( buscarEnHeladera(listaRecetasEvaluar.get(i).getListaIngrediente(), listaIngredientesDisponibles) == true){
                System.out.println("La Receta "+ listaRecetasEvaluar.get(i).getNombre()+" Es posible"); 
                posible = true;
            }
        }
        
        if (!posible){
            System.out.println("No se encontraron recetas posibles"); 
        }
    }
    
        private static boolean buscarEnHeladera(ArrayList<Ingrediente> listaIngredientesRecetas, ArrayList<Ingrediente> listaIngredientesDisponibles) {
        boolean valorDevolver = true;
        for (int j = 0; j < listaIngredientesRecetas.size(); j++) {            
                //System.out.println("Se comparara "+ listaIngredientesRecetas[j].getNombre()+" Con "+listaIngredientesDisponibles[i].getNombre());
                if( ! buscarIngredienteStringEnListaDeIngredientes(listaIngredientesRecetas.get(j).getNombre(),listaIngredientesDisponibles)){
                    return false;
                    //System.out.println("Significa que alguno de los ingredientes no se encuentra");
                
            
            }

        }
        return true;
    }
private static boolean buscarIngredienteStringEnListaDeIngredientes(String ingredienteBuscar,ArrayList<Ingrediente> listaIngredientesDisponibles){
for (int  i = 0; i < listaIngredientesDisponibles.size() ; i++ ){
    if( ingredienteBuscar.equals(listaIngredientesDisponibles.get(i).getNombre())){
        
        //Si  encuentra PAPA por ej , en la lista de todos los ingredientes devuelvo un true , sino un false
        return true;
    }
}
return false;
}
}
