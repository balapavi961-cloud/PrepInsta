import java.util.*;
public class PrepInsta6{

 public static Boolean isPrime(int num){
    if(num < 2) return true;
    for(int i=2;i<num;i++){
	if(num%i==0){
	  return false;
}

 }
    return true;
}


public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String left = sc.next();
   String right = sc.next();
   int num1 = Integer.parseInt(left);
   int num2 = Integer.parseInt(right);
   List<Integer> list = new ArrayList<>();
   for(int i=num1;i<=num2;i++){
	if(isPrime(i)){
	   list.add(i);
}
}
   int min = Integer.MAX_VALUE;
   int a = -1, b =-1;
   for(int i=0;i<list.size()-1;i++){
	int x = list.get(i);
	int y = list.get(i+1);
	if(y - x < min){
	   min = y - x;
	   a = x;
	   b = y;
}
}
int[] arr = new int[2];
   if(list.size() == 1){
     arr[0] =-1;
     arr[1] = -1;
}else{
   arr[0] = a;
   arr[1] = b;
}
   System.out.println(arr[0]);
   System.out.println(arr[1]);
}}