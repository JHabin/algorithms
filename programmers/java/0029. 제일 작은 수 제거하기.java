import java.util.ArrayList;
import java.util.Arrays;

class Solution {
        public ArrayList<Integer> solution(int[] arr) {
            ArrayList<Integer> res = new ArrayList<>();
            int min = Arrays.stream(arr).min().getAsInt();
            for (int a : arr){
                if (a != min) res.add(a);
            }
            if (res.isEmpty()) res.add(-1);
            return res;
        }
    }
