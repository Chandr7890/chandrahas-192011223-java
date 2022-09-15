import java.util.*;
class red_zero{
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      int n=a.nextInt();
      int c=0;
      while(n!=0){
         if(n%2==0){
            n=n/2;
            c++;
        
         }
         else{
            n=n-1;
            c++;
           
         }
      }
      System.out.println(c);
   }
}
