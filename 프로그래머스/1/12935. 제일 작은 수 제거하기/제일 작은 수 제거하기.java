import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answerList = new ArrayList<>();
        int minValue = Arrays.stream(arr).min().orElseThrow(NoSuchElementException::new);
        for (int i : arr) {
            if (i != minValue) {
                answerList.add(i);
            }
        }
        
        if (answerList.size() == 0) {
            answerList.add(-1);
        }
        
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}