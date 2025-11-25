class Solution {
    public int solution(int n) {
        int answer = 2; //초기값을 2로 설정해두면 if문이 참일 때만 1로 반환하고 거짓일 경우에는 초기값으로 반환.
        for(int i = 1; i < n; i++){
            if(i * i == n){
                answer = 1;
                break;// i*i==n 조건이 참인 경우 answer를 1로 반환하고 더이상 반복되지 않도록 break를 걸어준다.
            }
        }
        return answer;
    }
}