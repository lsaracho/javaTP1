/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatprecetas;

import java.util.ArrayList;
/**
 *
 * @author VTCLUSAR
 */
public class Receta {
    private String nombre;
    private ArrayList<Ingrediente> listaIngrediente;

    public Receta(String nombre) {
        this.nombre = nombre;
    }  
        
   
    public String getNombre() { 
        return nombre; 
    }
    
    public ArrayList<Ingrediente> getListaIngrediente() { 
        return listaIngrediente; 
    }
  
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public void setListaIngrediente(ArrayList<Ingrediente> listaIngrediente) {
        this.listaIngrediente = listaIngrediente; }
  
    class getListaIngrediente { public getListaIngrediente() { 
        }
    }
}