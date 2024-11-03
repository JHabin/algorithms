import java.util.Arrays;

class Solution {
        public int solution(int[] numbers) {
            int[] test = new int[10];
            int answer = 0;
            Arrays.fill(test, 0);
            for (int i = 0; i< numbers.length;i++){
                test[numbers[i]] = 1;
            }
            for (int j = 0; j < 10; j++){
                if (test[j] == 0) answer += j;
            }
            return answer;
        }
    }
