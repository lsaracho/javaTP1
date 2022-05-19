/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatprecetas;

import java.util.ArrayList;

/**
 *
 * @author VTCLUSAR
 */
public class JavaTpRecetas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
        
            ///TODOS ESTOS VALORES DEBEN LLENARSE CON EL OTRO ARCHIVO
            /*
    Ingrediente IngredienteReceta = new Ingrediente("CODAB","PIPI",1);
    Ingrediente IngredienteReceta2 = new Ingrediente("CODAB1","CEBOLLA",1);
    Ingrediente IngredienteReceta3 = new Ingrediente("CODAB2","HUEVO",1);
    
    //RISOTTO
    Ingrediente IngredienteRecetaA = new Ingrediente("CODAB3","ARROZ",1);
    Ingrediente IngredienteRecetaA2 = new Ingrediente("CODAB4","GRASA",1);
    Ingrediente IngredienteRecetaA3 = new Ingrediente("CODAB5","CALDO",1);
    Ingrediente IngredienteRecetaA4 = new Ingrediente("CODAB5","PARMESA",1);
    //INGREDIENTES DISPONIBLES EN ESTE CASO USO LOS MISMOS DE TORTILLÑA DE PAPA PARA LA PRUEBA
    ArrayList <Ingrediente> listaIngredientesParaReceta = new ArrayList<Ingrediente>();
    listaIngredientesParaReceta.add(IngredienteReceta);
    listaIngredientesParaReceta.add(IngredienteReceta2);
    listaIngredientesParaReceta.add(IngredienteReceta3);
    
    
    ArrayList <Ingrediente> listaIngredientesParaRisotto = new ArrayList<Ingrediente>();
    listaIngredientesParaRisotto.add(IngredienteRecetaA);
    listaIngredientesParaRisotto.add(IngredienteRecetaA2);
    listaIngredientesParaRisotto.add(IngredienteRecetaA3);
    listaIngredientesParaRisotto.add(IngredienteRecetaA4);
    
    //Ingrediente listaIngredientesParaReceta[]={IngredienteReceta,IngredienteReceta2,IngredienteReceta3};
    //Ingrediente listaIngredientesParaRisotto[]={IngredienteRecetaA,IngredienteRecetaA2,IngredienteRecetaA3,IngredienteRecetaA4};
    Receta recetaIndividualTortilla = new Receta(1,"receta tortilla de papa");
    recetaIndividualTortilla.setListaIngrediente(listaIngredientesParaReceta);
            
    Receta recetaIndividualRisotto = new Receta(2,"receta risotto");
    recetaIndividualRisotto.setListaIngrediente(listaIngredientesParaRisotto);
    
    ArrayList <Receta> listaRecetasEvaluar = new ArrayList<Receta>(); 
    listaRecetasEvaluar.add(recetaIndividualRisotto);
    listaRecetasEvaluar.add(recetaIndividualTortilla);
     
    ArrayList <Ingrediente> listaIngredientesDisponibles = new ArrayList<Ingrediente>();
    ArrayList <Ingrediente> listaIngredientesDisponibles2 = new ArrayList<Ingrediente>();
    listaIngredientesDisponibles.add(IngredienteReceta);
    listaIngredientesDisponibles.add(IngredienteReceta2);
    listaIngredientesDisponibles.add(IngredienteReceta3);
    listaIngredientesDisponibles.add(IngredienteRecetaA);
    //listaIngredientesDisponibles.add(IngredienteRecetaA2);
    listaIngredientesDisponibles.add(IngredienteRecetaA3);
    listaIngredientesDisponibles.add(IngredienteRecetaA4);
    //Receta listaRecetasEvaluar[] = {recetaIndividualTortilla,recetaIndividualRisotto};
    //Ingrediente  listaIngredientesDisponibles []={IngredienteReceta,IngredienteReceta3,
     //   IngredienteRecetaA,IngredienteRecetaA2,IngredienteRecetaA3};
        String pathRecetas = "C:/recetas.txt";
        String pathIngredientes = "C:/Users/vtclusar/OneDrive - Prisma Medios de Pago/Escritorio/Ingredientes.txt";
        
        ObtenerArchivo archivo = new ObtenerArchivo(pathRecetas, pathIngredientes);
        
        listaIngredientesDisponibles2 = archivo.ConvertirPathIngredientes();
    
        OrganizadorRecetas pepe = new OrganizadorRecetas();
        
        pepe.RecetasPosibles(listaRecetasEvaluar, listaIngredientesDisponibles2);

  
        
        System.out.println("HolaMundo2");
*/
            String obtenerPathRecetas = "";
            String ObtenerPathIngredientes = "";
            OrganizadorRecetas nuevaOrganizador = new OrganizadorRecetas();
            nuevaOrganizador.arracarOrganizadorRecetas(obtenerPathRecetas, ObtenerPathIngredientes);
            
            
    }
    
}

