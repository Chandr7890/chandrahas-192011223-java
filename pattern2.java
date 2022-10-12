 import java.util.*;
    class name{
        public static void main(String[] args){
            Scanner a=new Scanner(System.in);
            System.out.println("Enter the number of rows");
            int n=a.nextInt();
            int mid=(n/2)+1;
            int s=mid,k=1;
            for(int i=1;i<=n;i++){
                if(i<=mid){
                    for(int j=1;j<=i;j++){
                        System.out.print(i+" ");
                    }
                }
                else{
                    s--;
                    for(int j=1;j<=mid-k;j++){
                        System.out.print(s+" ");
                       
                    }
                    k++;
                }
                System.out.println();
            }
            if(n%2==0){
                System.out.println(1);
            }
           


        }
    }
