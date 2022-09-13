import java.util.*;
class spec_char{
   public static void main(String[] args){
      Scanner a=new Scanner (System.in);
      System.out.println("enter the string");
      String s=a.nextLine();
      List<Character> str=new ArrayList<>();
      int c=0;
      for(int i=0;i<s.length();i++){
         if(s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='0'&&s.charAt(i)<='9'||s.charAt(i)==' '){
            continue;
         }
         else{
           
            str.add(s.charAt(i));
            c++;
         }
      }
      System.out.println(c);
      System.out.println(str);
   }
