class Solution {
    public int solution(String message) {
        int answer = 0;
        char [] messageArray = message.toCharArray();//배열 반환으로 message의 글자수 확인
        answer=messageArray.length*2;
        return answer;
    }
}