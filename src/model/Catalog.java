package model;

import java.util.ArrayList;

public class Catalog {
    private ArrayList<Film> catalog;
    
    public Catalog(){
        catalog = new ArrayList<Film>();
        this.factory();
    }
    
    private void factory(){
        catalog.add(new Film("Jurassic Park","Aventura",1980,"imagen1","Spielberg","actor1,actor2",8,125));
        catalog.add(new Film("Pelicula Mala","Terror",1999,"imagen2","Director","actor2,actor3",2,111));
        catalog.add(new Film("Pelicula Niños","Animacion",2012,"imagen3","Director2","actor4",7,100));
    }
    
    public ArrayList<Film> getMoviesList() {
        return catalog;
    }
}
