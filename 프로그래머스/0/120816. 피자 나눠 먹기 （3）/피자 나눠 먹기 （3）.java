class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if(n%slice == 0){ // 먹는 사람의 수를 피자 조각 수로 나눴을 때 나머지 0인 경우에는 몫만큼 피자를 주문하면 된다.!!!대입이 아닌 0과 동등하다는 비교연산자를 조건에 작성해야함!!!
            answer = n/slice;
        } else{ // 나머지가 있는 경우에는 몫보다 1 큰 피자수가 필요하다.
            answer = n/slice + 1;
        }
        return answer;
    }
}