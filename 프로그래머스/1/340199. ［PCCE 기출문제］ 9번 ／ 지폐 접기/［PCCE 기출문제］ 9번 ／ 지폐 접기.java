import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int wallet_small, wallet_big, bill_small, bill_big;
        wallet_small = Math.min(wallet[0], wallet[1]);
        wallet_big = Math.max(wallet[0], wallet[1]);
        bill_small = Math.min(bill[0], bill[1]);
        bill_big = Math.max(bill[0], bill[1]);
        
        while (wallet_small < bill_small || wallet_big < bill_big) {
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
                // if (bill[0] < bill[1]) {
                //     bill_small = bill[0];
                //     bill_big = bill[1];
                // }
                bill_small = Math.min(bill[0], bill[1]);
                bill_big = Math.max(bill[0], bill[1]);
                answer++;
            } else {
                bill[1] /= 2;
                // if (bill[1] < bill[0]) {
                //     bill_small = bill[1];
                //     bill_big = bill[0];
                // }
                bill_small = Math.min(bill[0], bill[1]);
                bill_big = Math.max(bill[0], bill[1]);
                answer++;
            }
        }
        return answer;
    }
}