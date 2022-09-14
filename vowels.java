import java.util.*;
class vowels{
public static void main(String[] args){
Scanner a=new Scanner(System.in);
String str=a.nextLine();
int c=0;
for(int i=0;i<str.length();i++){
if(Character.toLowerCase(str.charAt(i))=='a'||Character.toLowerCase(str.charAt(i))=='e'||Character.toLowerCase(str.charAt(i))=='i'||Character.toLowerCase(str.charAt(i))=='o'||Character.toLowerCase(str.charAt(i))=='u')
{
c++;
}
}
System.out.println("No of vowels is ="+c);


}


}
