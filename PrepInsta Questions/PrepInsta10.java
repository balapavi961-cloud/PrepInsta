import java.util.*;

public class PrepInsta10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String[] s = st.split(" ");
        int[] arr = new int[s.length];
        for(int i=0;i<s.length;i++){
        arr[i]=Integer.parseInt(s[i]);
        }
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        int maxFreq = 0;
        for (int f : freq.values()) {
            if (f > maxFreq) {
                maxFreq = f;
            }
        }
        int sum = 0;
        for (int f : freq.values()) {
            if (f == maxFreq) {
                sum += f;
            }
        }

        System.out.println(sum);
    }
}
