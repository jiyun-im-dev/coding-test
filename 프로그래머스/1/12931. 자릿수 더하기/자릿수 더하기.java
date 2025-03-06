import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String s = String.valueOf(n);
        return Arrays.stream(s.split("")).mapToInt(Integer::parseInt).reduce(0, Integer::sum);
    
    }
}