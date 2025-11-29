import java.util.*;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
int n = s.length();
if (n == 0) {
System.out.println("");
return;
}

int start = 0;
int end = 0;
for (int i = 0; i < n; i++) {
int left = i;
int right = i;
while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
left--;
right++;
}
int oddLen = right - left - 1;
left = i;
right = i + 1;
while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
left--;
right++;
}
int evenLen = right - left - 1;
int len = Math.max(oddLen, evenLen);
if (len > end - start) {
start = i - (len - 1) / 2;
end = i + len / 2;
}
}
System.out.println(s.substring(start, end + 1));
}
}
