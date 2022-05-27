/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatprecetas;


import java.io.File;
import java.util.ArrayList;


/**
 *
 * @author JSierra
 */
public class LectorPath {
    
    private String path;
    
    public LectorPath(String pathEntrada){
        this.path = pathEntrada;
    }
         
    public ArrayList<File> getFiles() {

        ArrayList<String>  listaArchivosString = new ArrayList();
        File archivoPath = new File( this.path );
        ArrayList<File> listaArchivos = new ArrayList();
               
        if ( archivoPath.isDirectory( )) {
            for (int j=0; j<archivoPath.listFiles().length; j++){
                listaArchivos.add(archivoPath.listFiles()[j]);
            }
        } 
        return listaArchivos;
    }
}