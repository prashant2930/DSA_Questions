import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        // Loop through all possible substrings of length k
        for (int i = 0; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            
            // Update smallest if the current substring is smaller
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            
            // Update largest if the current substring is larger
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();
        
        System.out.println(getSmallestAndLargest(s, k));
    }
}