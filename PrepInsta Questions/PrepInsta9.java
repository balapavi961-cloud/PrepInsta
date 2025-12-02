import java.util.*;
public class PrepInsta9 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] st = s.split(" ");
        int[] arr = new int[st.length];
        for(int i=0;i<st.length;i++){
         arr[i]=Integer.parseInt();
        }
        int k = sc.nextInt(); 

        int n = arr.length;
        k = k % n;  // To handle k > n

        int[] rotated = new int[n];

        int index = 0;
        for (int i = k; i < n; i++) {
            rotated[index++] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            rotated[index++] = arr[i];
        }
        for (int x : rotated) {
            System.out.print(x + " ");
        }
    }
}
