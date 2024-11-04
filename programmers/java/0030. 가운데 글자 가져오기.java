class Solution {
        public String solution(String s) {
            String answer = "";
            int sLen = s.length();
            answer = (sLen % 2 == 1)? String.valueOf(s.charAt(sLen/2)) : s.substring((sLen / 2)-1, (sLen/2)+1);
            return answer;
        }
}
