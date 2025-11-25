class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char [] my_stringArray = my_string.toCharArray();
        
        for(int i = 0; i < my_string.length(); i++){
            if(my_stringArray[i] != letter.charAt(0)){//문자와 문자열을 비교하려면 항변환으로 두 변수의 타입을 맞춰야함. 문자열변수.charAt(index)
                answer += my_stringArray[i];
            }
        }
        return answer;
    }
}