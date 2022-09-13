import java.util.*;
class leap{
public static void main(String[] args){

Scanner a=new Scanner(System.in);
String str=a.next();
String[] str1=str.split("/");
int n=Integer.parseInt(str1[str1.length-1]);
if(n%4==0){
System.out.println(" given year is Leap year");
}
else{
System.out.println("Given year is non leap year");
}
}


}
