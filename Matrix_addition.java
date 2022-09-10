import java.util.*;
class Matrix_addition{
    public static void main(String[] args)
    {
        System.out.println("enter the no of rows");
        Scanner a=new Scanner(System.in);
        int n1=a.nextInt();
        System.out.println("enter the no of columns");
        int n2=a.nextInt();
        int arr1[][]=new int[n1][n2];
        int arr2[][]=new int[n1][n2];
        int sum[][]=new int[n1][n2];
        System.out.println("enter the 1st matrix");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                arr1[i][j]=a.nextInt();
            }
        }
        System.out.println("enter the second matrix");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                arr2[i][j]=a.nextInt();
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("sum of the matrix");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
