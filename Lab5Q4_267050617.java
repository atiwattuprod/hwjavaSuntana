public class Lab5Q4_267050617 {
    public static void main(String[] args) {
        String s1 = "I am happy";
        String s2 = "xyz";
        int x = 0;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char []c1 = s1.toCharArray();
        char []c2 = s2.toCharArray();
        for(int i = 0;i < c1.length;i++){
            if(c1[i] == 'a' || c1[i] == 'e' || c1[i] == 'i' || c1[i] == 'o' || c1[i] == 'u'){
                System.out.println(i);
                break;
            }
            x++;
            if(x == c1.length){
                System.out.println("-1");
            }
        }
        x = 0;
        for(int i = 0;i < c2.length;i++){
            if(c2[i] == 'a' || c2[i] == 'e' || c2[i] == 'i' || c2[i] == 'o' || c2[i] == 'u'){
                System.out.println(i);
                break;
            }
            x++;
            if(x == c2.length){
                System.out.println("-1");
            }
        }
    }
}
