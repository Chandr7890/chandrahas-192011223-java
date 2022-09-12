import java.util.*;
class rev{
   public static void main(String []args){
      Scanner a=new Scanner(System.in);
      try{
      int num=a.nextInt();
      System.out.println(numrev(num));
      }
      catch (Exception e){
         System.out.println("enter the integer number only");
      }
   }
   public static int numrev(int num){
      int rev=0;
    while(num!=0){
      int rem=num%10;
      rev=rev*10+rem;
      num=num/10;
    }
    return rev;
   }
   }
