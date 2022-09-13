import java.util.Scanner;
public class num
{
	public static void main(String[] args) {
	    int i,j;
try{
        int x;
	    Scanner s=new Scanner(System.in);
		System.out.println(" First Element as the number and Second Element as the Square of the number");
		System.out.println("Enter the values of m and n lower and uppper ranges");
		int m=s.nextInt();
		int n=s.nextInt();
		x=(n-m)+1;
		int k=m;
		int arr[][]=new int[x][5];
		System.out.println("The output is:");
		System.out.print("[");
		for(i=0;i<x;i++)
		{
		        arr[i][0]=k;
		        arr[i][1]=(k*k);
		        k=k+1;
		        System.out.print("("+arr[i][0]+",");
		        System.out.print(arr[i][1]+"),");
		}
		System.out.print("]");
	}
	    catch(Exception e)
	    {
	        System.out.println("Invalid");
	    }
	    
	
	}
}
