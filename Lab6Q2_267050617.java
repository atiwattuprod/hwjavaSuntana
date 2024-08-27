public class Lab6Q2_267050617 {
    public static void main(String[] args) {
        String input = "10 10 10 01 10 10";
        char []data = input.toCharArray();
        int x = 0;
        for(int i = 2;i < data.length;i += 3){
            if(data[i-1] != data[i+1]){
                x++;
            }
        }
        System.out.println(x);
    }
}
