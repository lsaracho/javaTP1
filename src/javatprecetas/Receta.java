/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatprecetas;

/**
 *
 * @author VTCLUSAR
 */
public class Receta {
    private int codigo;
    private String nombre;
    Ingrediente listaIngrediente[];

    public Receta(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }  
        
    public int getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Ingrediente[] getListaIngrediente() { return listaIngrediente; }
  
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setListaIngrediente(Ingrediente[] listaIngrediente) {
        this.listaIngrediente = listaIngrediente; }
  
    class getListaIngrediente { public getListaIngrediente() { 
        }
    }
