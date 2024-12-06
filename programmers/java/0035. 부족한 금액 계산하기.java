class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int firstPrice = price;
        for (int i = 1; i <= count; i++) {
            answer += firstPrice*i;
        }
        if (answer > money) return answer - money;
        else return 0;
    }
}
