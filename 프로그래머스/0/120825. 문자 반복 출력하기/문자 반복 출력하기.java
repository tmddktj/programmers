class Solution {
    public String solution(String my_string, int n) {
        char [] my_stringArray = my_string.toCharArray();//문자열을 문자 배열로 반환
        char [] answerArray = new char[my_string.length()*n];//answer의 문자 배열 생성
        
        int index = 0;
        for(int i = 0; i < my_string.length(); i++){ //my_string 문자 하나씩
            for(int count = 0; count < n; count++){//각 문자를 n만큼 반복하도록
                answerArray[index++] = my_stringArray[i];//answer의 배열에 차례로 my_stringArray 배열이 차례로 n번 반복해서 반환됨
            }
        }
        String answer = new String(answerArray);
        return answer;
    }
}