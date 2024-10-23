import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class demotest {
    public static void main(String[] args) {
        // testtt(); 
        // Scann();
        // demo2();
        // testCounterMovie();
        // tree(2);
        // flip();
        ArrayLis();
    }

    static void testtt(){
        Scanner sc = new Scanner(System.in);
        String []lis;
        String input = sc.nextLine();
        lis = input.split(" ");
        for(String token : lis)
            System.out.println(token);
        sc.close();
    }

    static void Scann(){
        try ( Scanner input = new Scanner(Paths.get("movies.csv"));){
            System.out.printf("%-20s%-10s%-10s%n","Name","Year","Grade");
            while(input.hasNext()){
                String row = input.nextLine();
                String [] dataFields = row.split(",");
                String Name = dataFields[0];
                int Year = Integer.parseInt(dataFields[1]);
                double Grade = Double.parseDouble(dataFields[2]);
                System.out.printf("%-20s%-10s%-10s%n",Name,Year,Grade);
            }
        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.err.printf("Data format error:  %s%n",e);
        }
        catch (IOException e){
            System.err.printf("Data format error:  %s%n",e);
            e.printStackTrace();
        }
    }

    static void demo2(){
        String row;
        String [] tokens;
        Movie[] ms = new Movie[100];
        int rowNum = 0;
        try(BufferedReader input = new BufferedReader(new FileReader("movies2.csv"))){
            while ((row =  input.readLine()) != null) {
                try{
                    tokens = row.split(",");
                    Movie m1 = new Movie(tokens[0], Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2]));
                    ms[rowNum] = m1;
                    rowNum++;
                }
                catch(Exception e){
                    System.out.println("At row " + (rowNum + 1) + ", exception named " + e + "...skip");
                    continue;
                } 
            }
            for(Movie token : ms){
                if(token == null)
                    break;
                System.out.println(token);
            }
        }
        catch(IOException e){
            System.err.println("from IO error");
            e.printStackTrace();
        }
    }

    static void testCounterMovie(){
        MovieCounter_67050617 loc1 = new MovieCounter_67050617();
        MovieCounter_67050617 loc2 = new MovieCounter_67050617();

        System.out.println("loc1");
        loc1.showAvailableList();
        loc1.checkout(1);
        System.out.println("\nshow");
        loc1.showAvailableList();
        System.out.println("\nshoewCheck");
        loc1.showCheckoutList();

        System.out.println("\nloc2");
        loc2.showAvailableList();
        loc2.checkout(2);
        System.out.println("\nshow");
        loc2.showAvailableList();
        System.out.println("\nshowCheck");
        loc2.showCheckoutList();
    }

    static void tree(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j < 3;j++){
                for(int k = 0;k < 5 + ((n -1) * 2);k++){
                    if(k < n+1-j-i || k > n+1+j+i){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }

    static void flip(){
        int[][] input = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] ans = new int[3][3];
        for(int i = 0;i < input.length;i++){
            for(int j = 0;j < input[i].length;j++){
                ans[i][j] = input[j][i];
            }
        }
        for(int[] token: input){
            System.out.println(Arrays.toString(token));
        }
        for(int[] token: ans){
            System.out.println(Arrays.toString(token));
        }
    }

    static void ArrayLis(){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(0);
        input.add(1);
        input.set(0, 55);
        input.set(1, 44);
        System.out.println(input);
    }
}
