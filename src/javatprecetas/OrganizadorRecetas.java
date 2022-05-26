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
       // boolean posible = false;
        for(int i=0; i<this.listaRecetasEvaluar.size(); i++){            
            //System.out.println("Se evaluara la receta : "+ this.listaRecetasEvaluar.get(i).getListaIngrediente());
             if( buscarEnHeladera(listaRecetasEvaluar.get(i).getListaIngrediente(), listaIngredientesDisponibles)){
               // System.out.println("La Receta "+ listaRecetasEvaluar.get(i).getNombre()+" Es posible"); 
                valorDevolver = valorDevolver + " La Receta "+ listaRecetasEvaluar.get(i).getNombre()+" Es posible\n" ;  
               // posible = true;
            }else{
               // System.out.println("La Receta "+ listaRecetasEvaluar.get(i).getNombre()+" No tiene suficientes ingredientes");
                valorDevolver = valorDevolver + " La Receta "+ listaRecetasEvaluar.get(i).getNombre()+" No tiene suficientes ingredientes\n" ;
            }
        }

       // if (!posible){
         //   System.out.println("No se encontraron recetas posibles"); 
        //}
        return valorDevolver;
    }
    
    private static boolean buscarEnHeladera(ArrayList<Ingrediente> listaIngredientesRecetas, ArrayList<Ingrediente> listaIngredientesDisponibles) {
    //boolean valorDevolver = true;
    for (int j = 0; j < listaIngredientesRecetas.size(); j++) {            
           // System.out.println("Se comparara el ing receta"+ listaIngredientesRecetas.get(j).getNombre());
            if( ! buscarIngredienteStringEnListaDeIngredientes(listaIngredientesRecetas.get(j).getNombre(),listaIngredientesDisponibles)){
                return false;
                //System.out.println("Significa que alguno de los ingredientes no se encuentra");
        }
    }
    return true;
    }

    
    private static boolean buscarIngredienteStringEnListaDeIngredientes(String ingredienteBuscar,ArrayList<Ingrediente> listaIngredientesDisponibles){
        for (int  i = 0; i < listaIngredientesDisponibles.size() ; i++ ){
           // System.out.println("Con el ingrediente" +listaIngredientesDisponibles.get(i).getNombre());
            if( ingredienteBuscar.equals(listaIngredientesDisponibles.get(i).getNombre())){
                //Si  encuentra PAPA por ej , en la lista de todos los ingredientes devuelvo un true , sino un false
                return true;
            }
        }
        return false;
    }
}
