import java.util.*;
class pandn{
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      int n=0;
      double c=0,c1=0;
      int sum=0,sum1=0;
      while(n!=-1){
         System.out.println("Enter the number");
          n=a.nextInt();
          if(n==-1){
            break;
          }
          if(n>0){
            sum=sum+n;
            c++;
          }
          else{
            sum1=sum1+n;
            c1++;
          }
      }
      double avg1=sum/c;
      double avg2=sum1/c1;
      System.out.println("The average of the negative number is="+avg2);
      System.out.println("The average of the positive number is="+avg1);
   }
}
