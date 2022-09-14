import java.util.*;
class fizzbuzz{
   public static void main(String[] args){
      List<String> li=new ArrayList<>();
      Scanner a=new Scanner(System.in);
      int n=a.nextInt();
      for(int i=1;i<=n;i++){
         if(i%3==0||i%5==0){
         if(i%3==0&&i%5==0){
            li.add("FIZZBUZZ");
         }
         else if(i%3==0){
            li.add("FIZZ");
         }
         else if(i%5==0){
            li.add("BUZZ");
         }
      }
      else{
         li.add(Integer.toString(i));
      }

      }
      System.out.println(li);
   }
}
