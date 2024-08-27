public class Lab6Q2_167050617 {
    public static void main(String[] args) {
        int []data1 = {58,4,13,15,63,9,8,81,1,78};
        int []data2 = {12,14,16,18,20,22,23,25,37,38,39,40};
        boolean result = true;
        for(int i = 0;i < data1.length - 1;i++){
            if(data1[i] > data1[i+1]){
                result = false;
                break;
            }
        }
        System.out.println("data1 : " + result);
        result = true;
        for(int i = 0;i < data2.length - 1;i++){
            if(data2[i] > data2[i+1]){
                result = false;
                break;
            }
        }
        System.out.println("data2 : " + result);
    }
}
