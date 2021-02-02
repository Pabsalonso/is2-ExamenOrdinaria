package model;

public class Film {
    private String title;
    private String genre;
    private int year;
    private String poster;
    private String director;
    private String actors;
    private int rating;
    private int length;
    
    public Film(String title, String genre, int year,String poster,
            String director,String actors, int rating, int length ){
        this.title=title;
        this.genre=genre;
        this.year=year;
        this.poster=poster;
        this.director=director;
        this.actors=actors;
        this.rating=rating;
        this.length=length;
    }

   public String getTitle(){
       return this.title;
   }
   
   public String getPoster(){
       return this.poster;
   }
   
   public String getDirector(){
       return this.director;
   }
   public String getActors(){
       return this.actors;
   }
   public String getGenre(){
       return this.genre;
   }
   
   public int getYear(){
       return this.year;
   }
   
   public int getRating(){
       return this.rating;
   }
}
