import java.util.*;

class Solution {
    public long solution(long n) {
        String [] strArray = String.valueOf(n).split("");
        Arrays.sort(strArray, Collections.reverseOrder());        
        return Long.parseLong(String.join("", strArray));
    }
}