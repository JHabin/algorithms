import java.util.LinkedList;

class Solution {
    public LinkedList<Long> solution(long n) {
            LinkedList<Long> list = new LinkedList<Long>();
            int i=0;
            while (n!=0){
                list.add(n%10);
                n/=10;
            }
            return list;
        }
}
