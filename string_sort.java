import java.util.*;
class string_sort{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n=a.nextInt();
        try{
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=a.next();
        }
        a.close();
        Arrays.sort(arr);
        for(String s:arr){
            System.out.println(s);
        }
    }
    catch(Exception e){
        System.out.println(e.toString());
    }
    }
}
