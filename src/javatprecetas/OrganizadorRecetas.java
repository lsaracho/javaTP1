/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatprecetas;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author VTCLUSAR
 */
public class OrganizadorRecetas {
    
    private  ArrayList<Receta> listaRecetasEvaluar = new ArrayList();
    private  ArrayList<Ingrediente> listaIngredientesDisponibles = new ArrayList();
    
    public String arracarOrganizadorRecetas(String pathRecetas,String pathIngredientes) throws IOException{
    
        ObtenerArchivo archivo = new ObtenerArchivo(pathRecetas, pathIngredientes);
        listaRecetasEvaluar = archivo.ConvertirPathRecetas();
        listaIngredientesDisponibles = archivo.ConvertirPathIngredientes();
        return this.RecetasPosibles(listaRecetasEvaluar,listaIngredientesDisponibles);
    
    }
    

    public  String RecetasPosibles(ArrayList<Receta> listaRecetasEvaluar, ArrayList<Ingrediente> listaIngredientesDisponibles){
        String valorDevolver ="";
        for(int i=0; i<this.listaRecetasEvaluar.size(); i++){            
             if( buscarEnHeladera(listaRecetasEvaluar.get(i).getListaIngrediente(), listaIngredientesDisponibles)){
                valorDevolver = valorDevolver + " La Receta "+ listaRecetasEvaluar.get(i).getNombre()+" Es posible\n" ;  
            }else{
                valorDevolver = valorDevolver + " La Receta "+ listaRecetasEvaluar.get(i).getNombre()+" No tiene suficientes ingredientes\n" ;
            }
        }
        return valorDevolver;
    }
    
    private static boolean buscarEnHeladera(ArrayList<Ingrediente> listaIngredientesRecetas, ArrayList<Ingrediente> listaIngredientesDisponibles) {
    for (int j = 0; j < listaIngredientesRecetas.size(); j++) {            
            if( ! buscarIngredienteStringEnListaDeIngredientes(listaIngredientesRecetas.get(j).getNombre(),listaIngredientesRecetas.get(j).getCantidad(),listaIngredientesDisponibles)){
                return false;
        }
    }
    return true;
    }

    
    private static boolean buscarIngredienteStringEnListaDeIngredientes(String ingredienteBuscar,int cantidadIngredienteReceta,ArrayList<Ingrediente> listaIngredientesDisponibles){
        for (int  i = 0; i < listaIngredientesDisponibles.size() ; i++ ){
            if( ingredienteBuscar.equals(listaIngredientesDisponibles.get(i).getNombre()) ){
                if ( cantidadIngredienteReceta <= listaIngredientesDisponibles.get(i).getCantidad()){
                return true;
                }
            }
        }
        return false;
    }
}
