import java.util.*;
class Conversion{
    public static void main(String [] args){
      try{
      Scanner a=new Scanner(System.in);
      System.out.println("enter the number of days ");
      int years=0,weeks=0,days1=0,r;
      int days=a.nextInt();
      r=days;
      if(days>=0){
      if(days>=365){
         years=days/365;
         r=days%365;
         weeks=r/7;
         days1=r%7;
      }
      else{
         weeks=r/7;
         days1=r%7;
         
      }
    
      System.out.println(" No of years= "+years);
      System.out.println(" No of weeks= "+weeks);
      System.out.println(" No of days= "+days1);
   }
   else{
      System.out.println("days should not be in negative");
   }
}
catch(Exception e){
   System.out.println("days should be in a integer");
}

    }
}
