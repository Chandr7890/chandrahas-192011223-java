import java.util.*;
class name{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
       System.out.println("Enter the integer");
       try{
       int n=a.nextInt();
       int sum=0;
       for(int i=1;i<n;i++){
        if(n%i==0){
            sum =sum+i;
        }
       }
       a.close();
       if(sum==n){
        System.out.println("Perfect number");
       }
       else{
        System.out.println("Not perfect number");
       }
    }
    catch(Exception e){
        System.out.println("Enter the integer number");
    }
        }
