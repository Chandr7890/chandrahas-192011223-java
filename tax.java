import java.util.Scanner;
public class tax
{
	public static void main(String[] args) {
	    int i,j;
try{
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter the income:");
		int n=s.nextInt();
		if(n<0)
		{
		    System.out.println("Invalid");
		}
		else if(n==0)
		{
		    System.out.println("No tax:0");
		}
		else if((0<n)&&(n<150001))
		{
		     System.out.println("No tax:0");
		}
		else if((150000<n)&&(n<300001))
		{
		    i=(n/100)*10;
		     System.out.println("tax:"+i);
		}
		else if((300000<n)&&(n<500001))
		{
		    i=(n/100)*20;
		    System.out.println("tax:"+i);
		}
		else{
		    i=(n/100)*30;
		    System.out.println("tax:"+i);
		}
	}
	    catch(Exception e)
	    {
	        System.out.println("Invalid");
	    }
	    
	
	}
}
