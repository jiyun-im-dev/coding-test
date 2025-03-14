import java.lang.Math;

class Solution {
    public long solution(long n) {
        if (Math.sqrt(n) % 1 == 0)  { // 루트를 씌운 값이 자연수인 경우
               return (long)Math.pow(Math.sqrt(n) + 1, 2);
        }
        return -1;
    }
}