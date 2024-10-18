class Solution {
    public long solution(long n) {
        long sum = 0;
        long i = 1;
        while (n >= sum){
            sum += 2*i - 1;
            i++;
            if (sum == n) return i*i;
        }
        return -1;
    }
}
