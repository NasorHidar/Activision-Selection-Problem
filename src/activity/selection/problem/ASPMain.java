package activity.selection.problem;
import java.util.*;

public class ASPMain {

	public static void ActivitySelection(ArrayList<ActivitySelectionProblem> activity) {
		int time=0;
		for(ActivitySelectionProblem i:activity) {
			if(i.getEnd()>time && i.getStart()>=time)
			{
				System.out.print(i.getId()+"  ");
				time=i.getEnd();
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Numbers of activity:");
		int n= scan.nextInt();
		scan.nextLine();
		ArrayList<ActivitySelectionProblem> activity= new ArrayList<>();
		System.out.println("Enter Activity no, Start and End time:");
		for(int i=0;i<n;i++)
		{
			String id =scan.next();
			int start =scan.nextInt();
			int end =scan.nextInt();
			scan.nextLine();
			ActivitySelectionProblem act=new ActivitySelectionProblem();
			act.setEnd(end);
			act.setId(id);
			act.setStart(start);
			activity.add(act);
			
		}
		System.out.println();
		Collections.sort(activity,new ASPComperator());
		
//		for(ActivitySelectionProblem i:activity)
//		{
//			System.out.print(i.getId()+"	");
//		}
		ActivitySelection(activity);
		scan.close();
	}

}
