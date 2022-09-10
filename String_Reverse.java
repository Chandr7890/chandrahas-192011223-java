import java.util.*;
class String_Reverse{
public String rev(){
Scanner a=new Scanner(System.in);
String str1=new String();
String str=a.nextLine();
for(int i=str.length()-1;i>=0;i=i-1){
str1=str1+str.charAt(i);
}

return str1;

}
}
class Reverse{
public static void main(String[] args){
reve ob=new reve();
System.out.println(ob.rev());

}
}
