import java.util.*;
class Factorial{
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      int n=a.nextInt();
      System.out.println(fact(n));
   }
   public static int fact(int n){
      if(n==1){
         return 1;
      }
      else{
         return n*fact(n-1);
      }
   }
}
