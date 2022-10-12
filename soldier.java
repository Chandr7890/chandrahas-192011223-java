 import java.util.*;
   class soldier{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter no of rows");
        int row=a.nextInt();
        System.out.println("enter no of col");
        int col=a.nextInt();
        int arr[][]=new int[row][col];
        int arr1[]=new int[row];
        int arr2[]=new int[row];
        for(int i=0;i<row;i++){
            int c=0;
            for(int j=0;j<col;j++){
                arr[i][j]=a.nextInt();
                if(arr[i][j]==1){
                    c++;
                }
            }
            arr1[i]=c;
            arr2[i]=c;
        }
        
        Arrays.sort(arr2);
        System.out.println("no of least elemnt index you want");
        
        int index=a.nextInt();
        List<Integer> li=new ArrayList<>();
        for(int i:arr2){
            for(int j=0;j<row;j++){
                if(i==arr1[j]){
                li.add(j);
                }

            }
            
        }
        for(int i=0;i<index;i++){
            System.out.print(li.get(i)+" ");
        }
    }
   }
