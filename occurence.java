import java.util.*;
class occurence{
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      List<Integer> li=new ArrayList<>();
      int n=a.nextInt();
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<n;i++){
         li.add(a.nextInt());
         if(map.containsKey(li.get(i))){
            map.put(li.get(i),map.get(li.get(i))+1);  
         }
         else{
            map.put(li.get(i),1);
         }
      }
      System.out.println(map);
   }
}
