package IIT;
import java.util.Scanner;

public class String_input {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of string :");
		int n=s.nextInt();
		s.nextLine();

		String[] st= new String[n];
		
		System.out.println("Enter strings:");
		for(int i=0;i<n;i++)
		{
			st[i]= s.nextLine();
		}
		
		System.out.println("\nYou entered:");
		
		for(String ns:st)
		{
			System.out.println(ns);
		}
		s.close();
	}

}
