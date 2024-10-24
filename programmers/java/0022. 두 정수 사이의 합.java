class Solution {
    public long solution(int a, int b) {
        int tmp;
        if (a > b) {tmp = a; a = b; b = tmp;}
        return sum(a,b);
    }
    private long sum(long a, long b){
        return (b - a + 1)*(a + b)/2;
    }
}
