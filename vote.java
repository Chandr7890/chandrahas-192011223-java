import java.util.*;
class vote{
 public static void main(String[] args){
    System.out.println("enter your age");
    Scanner a=new Scanner(System.in);
    String age=a.next();

    if(Double.valueOf(age)>=18){
       System.out.println("you are Elgible for vote");
    }
    else if(Double.valueOf(age)<18&&Double.valueOf(age)>=0){
        int c=Integer.valueOf(age);
        ;
        System.out.println("you are allowed to vote after"+" "+(18-c)+" "+"years");
    }
    else{
        System.out.println("your input should be integer and no negative age is allowed");
    }

 }


}
