import java.util.Arrays;
import java.util.Collections;

class Solution {
        public String solution(String s) {
            String answer = "";
            Character[] ansChar = new Character[s.length()];
            for (int i = 0; i < s.length(); i++) {
                ansChar[i] = s.charAt(i);
            }
            Arrays.sort(ansChar, Collections.reverseOrder());

            for (char a : ansChar) {
                answer += a;
            }
            return answer;
        }
    }
