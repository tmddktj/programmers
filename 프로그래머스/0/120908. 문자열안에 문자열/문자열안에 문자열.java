class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        if(str1.contains(str2)){//문자열1 안에 문자열2가 포함되어있는지 확인하는 메서드: 문자열1.contains(문자열2)
            answer = 1;
        } else{
            answer = 2;
        }
        return answer;
    }
}