import java.util.*;
class odd{
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      System.out.println("enter the n value");
      int n=a.nextInt();
      List<Integer>li=new ArrayList<>();

      for(int i=1;i<=(n*n+3);i++){
         if(i%2!=0){
         li.add(i);
         }
      }
      System.out.println(n+"th odd number after "+n+" odd numbers " +li.get((n+n)-1));

   }
}
