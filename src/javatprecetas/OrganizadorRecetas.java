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
    

       public  String RecetasPosibles(ArrayList<Receta> listaRecetasEvaluar, ArrayList<Ingrediente> listaIngredientesDisponibles){
        String devolver = "";
        for(int i = 0; i < listaRecetasEvaluar.size(); i++){            
            //si no encontró, devuelvo falso
            if( buscarEnHeladera(listaRecetasEvaluar.get(i).getListaIngrediente(), listaIngredientesDisponibles) == true){
                System.out.println("Se encontro el el "+ listaRecetasEvaluar.get(i).getNombre());                
            }
        }
        
        return "No se encontro un valor";
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
