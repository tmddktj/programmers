class Solution {
    public String solution(String my_string) {
        String answer = "";
        char [] stringArray = my_string.toCharArray();//문자열을 문자의 배열로 반환
        for(int i=stringArray.length-1; i>=0; i--){//역순(배열의 끝값부터 0까지)으로 출력되도록 반복문 작성
            answer += stringArray[i];//문자열은 문자의 배열 하나씩 늘어나도록 반환
        }
        return answer;
    }
}