import java.util.*;
class Right_Triangle{


public static void main(String[] args){
Scanner a=new Scanner(System.in);
int n=a.nextInt();
for(int i=0;i<n+1;i++){
fun(i,n);
}

}
public static void  fun(int i,int n){
for(int j=0;j<=n-i;j++){
System.out.print("  6");
}
for(int j=0;j<i;j++){
System.out.print("* ");
}
System.out.println();


}
}
