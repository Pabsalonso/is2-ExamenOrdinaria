package view;

import java.util.ArrayList;
import model.*;

public class View {
    public void showCatalog(ArrayList<Film> catalog){
        for(int i=0; i < catalog.size(); i++){
            System.out.println( 
                    catalog.get(i).getTitle()+"\n"+
                    catalog.get(i).getDirector()+"\n"+
                    catalog.get(i).getYear()+"\n"+
                    catalog.get(i).getGenre()+"\n"+
                    catalog.get(i).getRating()+"\n"+
                    catalog.get(i).getPoster()+"\n"+
                    catalog.get(i).getActors());
            
        }
    }
    
}
