package Technicaljava;
import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1; 
    }
}

public class Question2 {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        
        String s1 = "leetcode";
        System.out.println(solution.firstUniqChar(s1)); 
        
    }
}
