import java.util.*;
class pattern{
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      System.out.println("Eneter the number to be printed");
      int num=a.nextInt();
      System.out.println("Max number of times prnted");
      int n=a.nextInt();
      for(int i=0;i<n;i++){
         for(int j=0;j<=i;j++){
            System.out.print(num+" ");
         }
         System.out.println();
      }
      for(int i=1;i<n;i++){
         for(int j=0;j<n-i;j++){
            System.out.print(num+" ");
         }
         System.out.println();
      }
   }
}
