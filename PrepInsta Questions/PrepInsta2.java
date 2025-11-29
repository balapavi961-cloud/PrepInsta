import java.util.*;
public class PrepInsta2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
String[] s = str.split(" ");
int[] arr = new int[s.length];
for(int i=0;i<s.length;i++){
arr[i]=Integer.parseInt(s[i]);
}
int max = 0;
int n= arr.length;
for(int i=0;i<n;i++){
for(int j=i;j<n;j++){
if(Math.abs(arr[i]-arr[j]) <= Math.min(arr[i],arr[j])){
int ans = arr[i]^arr[j];
if(max<ans){
max = ans;
}
}
}
}
System.out.println(max);
}
}