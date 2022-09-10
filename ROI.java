import java.util.*;
class ROI{
   public static void main(String[] args){
    Scanner a=new Scanner(System.in);
    System.out.println("enter the priniciple amount");
    int p=a.nextInt();
    System.out.println("enter the no of years");
    int t=a.nextInt();
    System.out.println("Is customer seniour citizen y/n");
    String s=a.next();
    inter ob=new inter();
    if(t<0||p<0){
      System.out.println("enter the correct data amount or time should not be in negative");
      
    }
    else{
    ob.fun(p,t,s);
    }

   }
   public void fun(int p,int t,String s){
    
      if(s.charAt(0)=='y'){
            Double r =0.12;
            Double i=p*t*r;
            System.out.println("Interest= "+i);
      }
      else if(s.charAt(0)=='n'){
         Double r =0.1;
         Double i=p*t*r;
         System.out.println("Interest= "+i);

      }


   }

}
