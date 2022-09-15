import java.util.*;
class alpha_sort{
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      String str=a.nextLine();
      int n=str.length();
      char temp;
      char arr[]=str.toCharArray();
      for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
            if(arr[i]>arr[j]){
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
            }
         }
      }
      a.close();
      String str1=new String(arr);
      System.out.println(str1);
   }
}
