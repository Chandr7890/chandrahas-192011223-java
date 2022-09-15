import java.util.*;
class last_word{
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      String str=a.nextLine();
      String arr[]=str.split(" ");
      System.out.println(arr[arr.length-1]);
      System.out.println(arr[arr.length-1].length());
   }
}
