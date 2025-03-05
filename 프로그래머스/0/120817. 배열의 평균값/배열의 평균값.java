import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        double answer = Arrays.stream(numbers).reduce(0, Integer::sum);
        return answer / numbers.length;
    }
}