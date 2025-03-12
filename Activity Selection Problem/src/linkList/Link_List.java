package linkList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Node{
	int value;
	Node address;
	Node(int value,Node address)
	{
		this.value=value;
		this.address=address;
	}
}

public class Link_List {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		Node head = null;
		int point=0;
		while(point<4)
		{
			System.out.println("Enter Option");
			System.out.println("1.Add Node");
			System.out.println("2.Show LinkList");
			System.out.println("3.Delete Node");
			System.out.println("4.Exit");
			
		}
		
		scan.close();

	}

}
