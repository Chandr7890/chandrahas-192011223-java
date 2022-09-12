import java.util.*;
class pascal{
   public static void main(String[] args){
      List<Integer> li=new ArrayList<>();
      List<Integer> li1=new ArrayList<>();
      Scanner a=new Scanner(System.in);
      int c=1;
      int n=a.nextInt();
      li.add(1);
     
      li.add(1);
      for(int i=0;i<n;i++){
         for(int j=0;j<n-i;j++){
            System.out.print("  ");
         }
        
        if(c==1){
         System.out.print("1");
        }
        else{
         li1.add(1);
         for(int k=0;k<li.size();k++){
            
            System.out.print( li.get(k)+"   ");
            if(k<li.size()-1){
           
            li1.add(li.get(k)+li.get(k+1));
            }
         }
         li1.add(1);
         li.clear();
         li.addAll(li1);
         li1.clear();  
      }
      c++;
         System.out.println ();
      }
}
}
