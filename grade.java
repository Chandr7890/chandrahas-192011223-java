import java.util.*;
class grade{
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      System.out.println("Enter the marks in python");
      int py=a.nextInt();
      System.out.println("Enter the marks in c programming");
      int c=a.nextInt();
      System.out.println("Enter the marks in Mathematics");
      int mat=a.nextInt();
      System.out.println("Enter the marks in Physics");
      int phy=a.nextInt();
      int tot=mat+py+c+phy;
      Double agre=(tot/(400.0))*100;
      System.out.println("Total="+tot);
      System.out.println("Agreegate="+agre);
            if(agre>75){
         System.out.println("Distinction");
      }
      else if(agre>=60&&agre<75){
         System.out.println("First Division");
      }
      else if(agre>=50&&agre<60){
         System.out.println("Second Division");
      }
      else if(agre>=40&&agre<50){
         System.out.println("Third Division");
      }
      else{
         System.out.println("Fail");
      }
     
   }

}
