class Solution {
    int answer = 0;
    
    public int solution(double num) {    
        while (num > 1) {
            num = collatz(num);
            answer++;
            if (num == 1) break;
            if (answer == 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
    
    public double collatz(double num) {        
        if (num % 2 == 0) { // 짝수인 경우
            return num /= 2;
        } 
        
        else { // 홀수인 경우
            return num * 3 + 1;
        }
    }
    
}