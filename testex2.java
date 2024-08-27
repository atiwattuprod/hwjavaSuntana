import java.util.Scanner;

public class testex2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter BPM: ");
		Double BPM = sc.nextDouble();
		System.out.print("Timing: ");
		int time = sc.nextInt();
		System.out.print("Enter Length(Minute): ");
		int min = sc.nextInt();
		System.out.print("Enter Length(Second): ");
		int sec = sc.nextInt();
		Double ans = (BPM/60 * ((min * 60) + sec))/time;
		System.out.println("Total Song Room = " + ans);
		sc.close();
	}
}