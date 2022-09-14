import java.util.*;
 abstract class customer{
   public abstract  void account_no(int no);
   public abstract  void depo_name( String name);
   public abstract  void account_type( String  s);
   public abstract void amount( int amou);
 }
 class cust extends customer{
   public void account_no(int no) {
      System.out.println("the account number is="+no);
   }
   public void depo_name(String name) {
      System.out.println("Depositer name is="+name);  
   }
   public void account_type(String s) {
      if(s.charAt(0)=='s'){
System.out.println("type of account is saving");
      }
      else if(s.charAt(0)=='c'){
System.out.println("type of account is  current");
      }
      else{
         System.out.println("enter the correct data");
         
      }
   }
   public void amount( int amou) {
      amou=amou+10000;
      System.out.println("Total amount is="+amou); 
   }
}

 class holder{
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      cust ob=new cust();
      int amou,no;
      String name;
      String  s;
      try{
      System.out.println(" enter the account  number ");
      no=a.nextInt();
      System.out.println(" enter the account holder name");
      name=a.next();
      System.out.println(" enter the type of an account");
      s=a.next();
      System.out.println("enter the amount that to be depositing ");
      amou=a.nextInt();
      ob.account_no(no);
      ob.depo_name(name);
      ob.account_type(s);
      ob.amount(amou);
      }
      catch (Exception e){
  System.out.println("enter the correct data");
      }
     
   }
 }
