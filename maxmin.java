import java.util.*;
class maxmin{
    public static void main(String[] args){
        List<Integer> arr=new ArrayList<>();
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        for(int i=1;i<n+1;i++){
            arr.add(a.nextInt());
        }
        
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println("enter nth maximum index");
        int max=a.nextInt();
        System.out.println("enter nth minimum index");
        int min=a.nextInt();
        int max1=arr.get(n-max),min1=arr.get(min-1);
        System.out.println( n-max+ " th maximum number is"+ " "+max1);
        System.out.println(min-1+" th minimum number is"+ " "+min1);
        int sum=Integer.sum(max1,min1);
        int diff=max1-min1;
        System.out.println("sum is "+sum);
        System.out.println("difference is "+diff);
        a.close();

       

    }
}
