import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MovieCounter_67050617 {
    ArrayList<Movie> availableList = new ArrayList<>();
    ArrayList<Movie> checkOutList = new ArrayList<>();

    MovieCounter_67050617(){
        String row;
        String [] tokens;
        try(BufferedReader input = new BufferedReader(new FileReader("movies2.csv"))){
            while ((row = input.readLine()) != null) {
                try{
                    tokens = row.split(",");
                    Movie m1 = new Movie(tokens[0], Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2]));
                    availableList.add(m1);
                }
                catch(Exception e){
                    continue;
                } 
            }
        }
        catch(IOException e){
            System.err.println("from IO error");
            e.printStackTrace();
        }  
    }
        
    public void checkout(int index){
        checkOutList.add(availableList.get(index));
        availableList.remove(index);
    }

    public void showAvailableList(){
        System.out.println("The following titles are avaliable.");
        for(Movie token : availableList){
            System.out.println(token);
        }
    }

    public void showCheckoutList(){
        System.out.println("The following titles have been checked out.");
        for(Movie token : checkOutList){
            System.out.println(token);
        }
    }
}
