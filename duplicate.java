import java.util.*;
class duplicate{
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      System.out.println("enter the number of elements in an array");
      int n=a.nextInt();
      List<Integer>li=new ArrayList<>();
      for(int i=0;i<n;i++){
         System.out.println("Enter the element"+i+":");
        li.add(a.nextInt());
      }
      Set<Integer> set=new HashSet<>(li);
      System.out.println(set);
   }
}
