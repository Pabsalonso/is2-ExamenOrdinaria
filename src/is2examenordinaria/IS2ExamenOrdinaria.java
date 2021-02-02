/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is2examenordinaria;
import java.util.Scanner;
import model.*; 
import view.*;

/**
 *
 * @author Pablo Alonso
 */
public class IS2ExamenOrdinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Catalog catalog = new Catalog();
        View vista= new View();
        System.out.println("Bienvenido,nuestro catalogo:");
        vista.showCatalog(catalog.getMoviesList());
        System.out.println("Introduzca un comando para ordenar por:\n"
                + "genero, novedades o valoracion");
        while(true){
            Scanner reader = new Scanner(System.in);  // Creamos el escaner
            CatalogControl.catalogSorter(catalog,reader.nextLine());
            vista.showCatalog(catalog.getMoviesList());
        }
        
        
    }
    
}
