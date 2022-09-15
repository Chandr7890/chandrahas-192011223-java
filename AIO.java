import java.util.*;
class AIO{
public static void main(String[] args){
   Scanner a=new Scanner(System.in);
 
   int[] arr=new int[10];
   int n=a.nextInt();
   try{
      int sum=0;
      for(int i=0;i<n;i++){
         arr[i]=a.nextInt();
         sum=sum+arr[i];
      }
      System.out.println(sum);
   }
   catch(Exception e){
      System.out.println(e.toString());
   }

}
}
