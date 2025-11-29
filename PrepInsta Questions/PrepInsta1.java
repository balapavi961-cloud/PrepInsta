import java.util.*;
public class PrepInsta1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int k = sc.nextInt();
String str = "0";
for(int i=1;i<n;i++){
if(str.charAt(i-1) == '0') str+='1';
else str+="10";
}
System.out.println(str.charAt(k-1));
}
}