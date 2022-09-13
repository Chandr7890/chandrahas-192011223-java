import java.util.*;
class M{
   public static void main(String[] args){
   List<Integer>li=new ArrayList<>();
   Scanner a=new Scanner(System.in);
   System.out.println("enter the number of elements");
   int n=a.nextInt();
   for(int i=0;i<n;i++){
      li.add(a.nextInt());
   }
   int sum=li.stream().mapToInt(Integer::intValue).sum();
   float n1=n;
   float mean=sum/n1;
   System.out.println("Mean="+mean);
   int c1=0,mode=0,median=0;
   for(int i=0;i<n;i++){
      int c=Collections.frequency(li,li.get(i));
      if(c>c1){
         c1=c;
         mode=li.get(i);
      }
   }
   Collections.sort(li);
   if(n%2==0){
      float median1=(li.get((n/2)-1)+li.get((n/2)-1)+1)/2;
      System.out.println("Median="+median1);
   }
   else{
    int mid=(n+1)/2;
    median=li.get(mid-1);
    System.out.println("Median="+median);
   }
   System.out.println("mode="+mode);
   }
}
