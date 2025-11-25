class Solution {
    public int solution(int n, int t) {
        int answer = n;
        for(int h = 1; h <= t; h++){
            answer *=2;
        }
        return answer;
    }
}