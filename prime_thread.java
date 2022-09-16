import java.util.*;
class a implements Runnable{
   public void run(){
      Scanner x=new Scanner(System.in);
      int n=x.nextInt();
      int c=0;
      for(int i=2;i<n;i++){
         if(n%i==0){
            c++;
         } 
      }
      if(c==0){
         System.out.println(n+" is Prime");
      }
      else{
         System.out.println("Not a prime");
      }
   }
}
class prime_thread{
   public static void main(String[] args){
      a ob=new a();
      Thread t=new Thread(ob);
     
      t.start( );
   }
}
