import java.util.*;
class composite{
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      int num1=a.nextInt();
      int num2=a.nextInt();
      int c=0;
      if(num2>num1){
      for(int i=num1+1;i<num2;i++){
         c=0;
         for(int j=1;j<num2;j++){
            if(i%j==0){
               c++;
            }
         }
         if(c>2){
            System.out.print(i+",");
         }
      }
   }
   else if(num2<num1){
      for(int i=num1-1;i>num2;i--){
       
         c=0;
         for(int j=1;j<num1;j++){
            if(i%j==0){
               c++;
            }
         }
         if(c>2){
            System.out.print(i+",");
         }
      }
   }
   else{
      System.out.println("there is no number between that");
   }

   }
}
