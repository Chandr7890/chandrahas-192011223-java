import java.util.*;
class palindrom{
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      StringBuilder str=new StringBuilder();
      str.append(a.next());
         while(Integer.parseInt(str.toString())!=(Integer.parseInt((str.reverse()).toString()))){ 
          int x=Integer.parseInt(str.toString());
          int y=Integer.parseInt((str.reverse()).toString());
          int z=x+y;
          str.delete(0,str.length());
          str.append(Integer.toString(z));
         }
   a.close();
      System.out.println(str);
   }
}
