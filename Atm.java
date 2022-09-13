import java.util.Scanner;
public class Atm
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a,a1,b,b1,c,c1,d,d1,x;
        System.out.println("Enter the 1st Denomination:");
        a=s.nextInt();
        System.out.println("Enter the 1st Denomination number of notes");
        a1=s.nextInt();
        System.out.println("Enter the 2nd Denomination:");
        b=s.nextInt();
        System.out.println("Enter the 2nd Denomination number of notes");
        b1=s.nextInt();
        System.out.println("Enter the 3rd Denomination:");
        c=s.nextInt();
        System.out.println("Enter the 3rd Denomination number of notes");
        c1=s.nextInt();
        System.out.println("Enter the 4th Denomination:");
        d=s.nextInt();
        System.out.println("Enter the 4th Denomination number of notes");
        d1=s.nextInt();
        x=((a*a1)+(b*b1)+(c*c1)+(d*d1));
        System.out.println("Total Available Balance in ATM:"+x);
    }
}
