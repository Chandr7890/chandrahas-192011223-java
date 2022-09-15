import java.util.*;
class sumofdigits{
 
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      int n;
      System.out.println("enter the n  digit value");
      n=a.nextInt();
      System.out.println("enter the "+n+" digit number");
      String str=a.next();
      Integer sum=0;
      a.close();
      for(int i=0;i<str.length();i++){
      
         //sum=sum+Character.getNumericValue(str.charAt(i));
         sum=sum+(str.charAt(i)-'0');
      }
      System.out.println(sum);
      if(sum<10){
         System.out.println("sum of "+n+" digit number is="+sum);
      }
      else{
         System.out.println("Sum should be in single digit");
      }
      System.out.println(sum.getClass().getSimpleName());

   }
}
