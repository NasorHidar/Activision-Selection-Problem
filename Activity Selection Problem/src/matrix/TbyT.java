package matrix;
import java.util.Scanner;
public class TbyT {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Matrix size is n X n. Enter n:");
		int n= scan.nextInt();
		int [][] t=new int [n][n];
		System.out.println("Enter the matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				t[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			    System.out.print(t[i][j]+" 	");
			}
			System.out.println();
		}
		scan.close();

	}

}
