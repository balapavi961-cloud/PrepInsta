import java.util.*;
public class PrepInsta7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();

        while(s.length()>k){
            StringBuilder str=new StringBuilder();
            for(int i=0;i<s.length();i+=k){
                String sub;
                int sum=0;
                if(s.length()>=i+k){
                    sub=s.substring(i,i+k);
                }
                else{
                    sub=s.substring(i);
                }
                for(char c:sub.toCharArray()){
                    sum+=(c-'0');
                }
                str.append(sum);
            }
            s=str.toString();
        }
        System.out.println(s);
    }

}