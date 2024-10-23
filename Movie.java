public class Movie {
    String title;
    int releasedYear;
    double rating;

    Movie(){

    }

    Movie(String title, int Year, double rating){
        this.title = title;
        releasedYear = Year;
        this.rating = rating;
    }

    String getTitle(){
        return title;
    }

    int getReleased(){
        return releasedYear;
    }

    double getRating(){
        return rating;
    }

    @Override
    public String toString(){
        return title + "(" + releasedYear + "," + rating + ")";
    }
}
