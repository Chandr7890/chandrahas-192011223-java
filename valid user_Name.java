import java.util.*;

class user_Name{
    public static void main(String [] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter the user name");
        String str1=a.nextLine();
        System.out.println("Reenter the user name");
        String str2=a.nextLine();

        compare ob=new compare(str1,str2);
        ob.com();
    }
    }
class compare{
    String str1;
    String str2;
    compare(String str1,String str2){
        this.str1=str1;
        this.str2=str2;
    }
    public void com(){
        if(str1.equals(str2)){
            System.out.println("User name is valid");
        }
        else{
            System.out.println("User name is not valid");
        }
   
    }


}    











