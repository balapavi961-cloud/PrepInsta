import java.util.*;

public class PrepInsta8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        int n = arr.length;

        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }

        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < n; i++) {
            index.put(arr1[i], i);
        }

        int dp[][] = new int[n][n];
        int ans = 0;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < j; i++) {
                int pre = arr1[j] - arr1[i];

                if (index.containsKey(pre)) {
                    int k = index.get(pre);
                    if (k < i) {
                        dp[i][j] = dp[k][i] + 1;
                    } else {
                        dp[i][j] = 2;
                    }
                } else {
                    dp[i][j] = 2;
                }

                ans = Math.max(ans, dp[i][j]);
            }
            index.put(arr1[j], j);
        }

        if (ans >= 3) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }
}

