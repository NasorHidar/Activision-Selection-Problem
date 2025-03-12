package asp;
import java.util.Scanner;
public class ASP {

	public static void selectActivities(int[] activity, int[] start, int[] end, int n) {
        int time = 0;
        
        for(int i = 0; i < n; i++) {
            if(end[i] > time && time < start[i]) {
                System.out.print("A" + activity[i] + " ");
                time = end[i];
            }
        }
    }
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Number of activites:");
		int n=scan.nextInt();
		
		int[] activity= new int[n];
		int[] start= new int[n];
		int[] end= new int[n];
		System.out.println("Enter Activity No, start time and end time:");
		for(int i=0;i<n;i++)
		{
			activity[i]=scan.nextInt();
			start[i]=scan.nextInt();
			end[i]=scan.nextInt();
		}
		
		selectActivities(activity,start,end,n);
		
		scan.close();
	}

}
