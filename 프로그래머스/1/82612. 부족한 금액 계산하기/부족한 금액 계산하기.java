class Solution {
    public long solution(int price, int money, int count) {
        long changedPrice = price;
        long longMoney = (long)money;
        for (int i = 1; i <= count; i++) {
            longMoney -= changedPrice;
            changedPrice = price * (i+1);
        }
        return longMoney > 0 ? 0 : longMoney * -1;
    }
}