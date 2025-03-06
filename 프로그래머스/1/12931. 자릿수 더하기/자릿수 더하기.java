import java.util.*;

public class Solution {
    public int solution(int n) {
        String s = String.valueOf(n);
        return Arrays.stream(s.split("")).mapToInt(Integer::parseInt).reduce(0, Integer::sum);
    }
}