class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        for (int i = x; i > 0; i /= 10) {
            sum += i % 10;
        }
        answer = x % sum == 0 ? true : false;
        return answer;
    }
}