import java.util.*;
class hallow_pat{
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      System.out.println("enter the no of rows");
      int n=a.nextInt();
      for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
            if(i==0 && j<n||j==0&&i<n||i==n-1&&j<n||j==n-1&&i<n){
               System.out.print("$ ");
            }
           else{
            System.out.print("  ");
           }
         }
         System.out.println();
      }

   }
}
