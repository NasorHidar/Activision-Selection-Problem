package activity.selection.problem;
//import java.util.*;

public class ActivitySelectionProblem {

	private int end , start;
	private String id;
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Activities [end=" + end + ", start=" + start + ", id=" + id + "]";
	}
	
	}

