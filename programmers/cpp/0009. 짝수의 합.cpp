// 짝수의 합 = 2 + ... + n = k가 1..n/2까지인 2k의 합 = 2 * {((n/2) * (n/2) + 1) / 2}
// 대신 2k가 홀수인 경우, 짝수값으로 변경해야 하므로 n/2로 표현함.
int solution(int n) {
    int answer = 0;
    answer = (n/2)*((n/2)+1);
    return answer;
}
