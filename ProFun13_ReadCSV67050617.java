import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * ProFun13_ReadCSV67050617
 */
public class ProFun13_ReadCSV67050617 {
    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
        demo4();
    }

    static void demo1(){
        String row;
        String [] tokens;
        int col = 1;
        try(BufferedReader input = new BufferedReader(new FileReader("movies.csv"))){
            while ((row = input.readLine()) != null) {
                tokens = row.split(",");
                System.out.print(col + "\t" + tokens[0] + "," + tokens[1] + "," + tokens[2]);
                System.out.println();
                col++;
            }
        }
        catch(IOException e){
            System.err.println("from IO error");
            e.printStackTrace();
        }
    }

    static void demo2(){
        String row;
        String [] tokens;
        try(BufferedReader input = new BufferedReader(new FileReader("movies.csv"))){
            while ((row = input.readLine()) != null) {
                tokens = row.split(",");
                Movie m1 = new Movie(tokens[0], Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2]));
                System.out.println(m1);
            }
        }
        catch(IOException e){
            System.err.println("from IO error");
            e.printStackTrace();
        }
    }

    static void demo3(){
        String row;
        String [] tokens;
        ArrayList<Movie> ms = new ArrayList<>();
        int rowNum = 0;
        try(BufferedReader input = new BufferedReader(new FileReader("movies2.csv"))){
            while ((row = input.readLine()) != null) {
                try{
                    tokens = row.split(",");
                    Movie m1 = new Movie(tokens[0], Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2]));
                    ms.add(m1);
                    rowNum++;
                }
                catch(Exception e){
                    System.out.println("At row " + (rowNum + 1) + ", exception named " + e + "...skip");
                    continue;
                } 
            }
            for(Movie token : ms){
                System.out.println(token);
            }
        }
        catch(IOException e){
            System.err.println("from IO error");
            e.printStackTrace();
        } 
    }

    static void demo4(){
        String row;
        String [] tokens;
        ArrayList<Movie> ms = new ArrayList<>();
        try(BufferedReader input = new BufferedReader(new FileReader("movies2.csv"))){
            while ((row = input.readLine()) != null) {
                try{
                    tokens = row.split(",");
                    Movie m1 = new Movie(tokens[0], Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2]));
                    ms.add(m1);
                }
                catch(Exception e){
                    continue;
                } 
            }
            for(Movie token : ms){
                System.out.println(token);
            }
        }
        catch(IOException e){
            System.err.println("from IO error");
            e.printStackTrace();
        } 
    }
}