package activity.selection.problem;
import java.util.*;
public class ASPComperator implements Comparator <ActivitySelectionProblem> {

	@Override
	public int compare(ActivitySelectionProblem o1, ActivitySelectionProblem o2) {
		// TODO Auto-generated method stub
		return o1.getEnd()-o2.getEnd();
	}

}
