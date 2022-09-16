import java.util.*;

class bin_matrix{
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      System.out.println("enter the no of rows");
      int n=a.nextInt();
      System.out.println("enter theno of columns");
      int n1=a.nextInt();
      System.out.println("input should be 0 an 1");
      int [][] arr=new int[n][n1];
     
      
     List<Integer>li=new ArrayList<>();
      for(int i=0;i<n;i++){
         int c=0;
         for(int j=0;j<n1;j++){
          arr[i][j]=a.nextInt();
          if(arr[i][j]==1){
            c++;
          }
         }
         li.add(c);
      }
      List<Integer>li1=new ArrayList<>(li);
      Collections.sort(li1);
      List<Integer> li2=new ArrayList<>();
      for(int i=0;i<li.size();i++){
         for(int j=0;j<li.size();j++){
            if(li1.get(i)==li.get(j)){
               li2.add(j);
               li.set(j,1000000000);
               break;
            }
         }
      }
      System.out.println("upto how many elements you want");
      int el=a.nextInt();
      System.out.println(li2);
      System.out.print("[");
      for(int i=0;i<el;i++){
         System.out.print(li2.get(i)+",");
      }
      System.out.print("]");

   }
}
