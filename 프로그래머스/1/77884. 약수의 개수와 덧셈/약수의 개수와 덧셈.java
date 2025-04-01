class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (getDivisorCount(i) % 2 == 0) { // 약수의 개수가 짝수면 더한다
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
    
    public int getDivisorCount(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}