package asp;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Activities{
	int start, end;
	String id;
	Activities(String id,int start,int end)
	{
		this.id=id;
		this.start=start;
		this.end=end;
	}
}

public class OOPCodeASP {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number of Activities:");
		int n=scan.nextInt();
		scan.nextLine();
		Activities[] activity= new Activities[n]; 
		System.out.println("Enter Activity No,Start Time and End Time:");
		for(int i=0;i<n;i++)
		{
			String id=scan.next();
			int start=scan.nextInt();
			int end=scan.nextInt();
			scan.nextLine();
			activity[i]=new Activities(id,start,end);
		}
		selection(activity,n);
		
		scan.close();
	}
	public static void selection(Activities[] activity,int n) {
		Arrays.sort(activity,Comparator.comparingInt(a->a.end));
		int lastTime=0;
		System.out.println("\nSelected Activities:");
		for(Activities act:activity)
		{
			if(lastTime<act.end && lastTime<act.start)
			{
				System.out.print(act.id +" + ");
				lastTime=act.end;
			}
		}
		System.out.println("End");
		
	}

}
