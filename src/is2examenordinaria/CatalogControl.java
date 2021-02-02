package is2examenordinaria;

import java.util.Collections;
import model.*;

public class CatalogControl {
    
    public static void catalogSorter(Catalog catalog,String sortBy){
        switch(sortBy){
            case "genero":
                catalog.getMoviesList().sort( 
            (a, b) -> a.getGenre().compareTo(b.getGenre()));
                break;
            case "novedades": 
                catalog.getMoviesList().sort( 
            (a, b) -> Integer.compare(b.getYear(),a.getYear())); 
                Collections.reverse(catalog.getMoviesList()); 
                break;
                
            case "valoracion":
                catalog.getMoviesList().sort( 
            (a, b) -> Integer.compare(b.getRating(),a.getRating())); 
                Collections.reverse(catalog.getMoviesList()); 
        }
    }
    
//    public Film searchFilm(){
//        
//    }
}
