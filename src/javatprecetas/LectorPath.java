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
    
    /*public void ProcesarPath(){
        
        ArrayList<String> files = new ArrayList(this.getFiles(this.path)); 
        //files = this.getFiles(this.path);

        if ( files != null ) {

            //int size = files.length;

            for ( int i = 0; i < files.size(); i ++ )
                System.out.println( files.get(i));
                //System.out.println( files[ i ] );
        }
    }*/
            
    public ArrayList<File> getFiles() {

        ArrayList<String>  listaArchivosString = new ArrayList();
        File archivoPath = new File( this.path );
        ArrayList<File> listaArchivos = new ArrayList();
               
        if ( archivoPath.isDirectory( )) {
            for (int j=0; j<archivoPath.listFiles().length; j++){
                listaArchivos.add(archivoPath.listFiles()[j]);
            }
            
            /*
            ArrayList<String> res   = new ArrayList();
            for ( int i = 0; i < listaArchivos.size(); i ++ ) {
                if(listaArchivos.get(i).isFile()){
                    res.add( listaArchivos.get(i).toString( ));
                }        
            }
             
            listaArchivosString = res;
            */
        } else
            System.err.println( "¡ Path NO válido !" );

        //return listaArchivosString;
        return listaArchivos;
    }
}