import java.util.*;
   class  student{
    public  int rool(){
       
            Scanner a=new Scanner(System.in);
            System.out.println("Enter the rool number");
            int rool_no=a.nextInt();
            a.close();
            return rool_no;
    }
            
        
    }
   class test extends student{
        public  int integer_marks(){
            Scanner a=new Scanner(System.in);
            System.out.println("enter the no of sub");
            int n=a.nextInt();
            int arr[]=new int[n];
            System.out.println("enter the marks");
            int sum=0;
            for(int i=0;i<n;i++){
                arr[i]=a.nextInt();
                sum=sum+arr[i];
            }
            a.close();
            return sum;


        }
    }
     class result extends test{
        public  void result1(){
            test ob=new test();
            int sum=ob.integer_marks();
            System.out.println("total marks: "+sum);
            System.out.println("rool no: "+ob.rool());


        }

    }
    class inheritance{
        public static void main(String[] args){
            result ob=new result();
            
            ob.result1();
    
        }
    }
