import java.util.*;
public class PrepInsta5{

public static int findgcd(int a,int b)
{
    if(b == 0) return a;
    return findgcd(b,a%b);

}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
String[] s = str.split(" ");
int[] arr = new int[s.length];
for(int i=0;i<s.length;i++){
arr[i]=Integer.parseInt(s[i]);
}
int min = Arrays.stream(arr).min().getAsInt();
int max = Arrays.stream(arr).max().getAsInt();
int gcd = findgcd(min,max);
System.out.println(gcd);
}}