class Solution {
    public String solution(String my_string) {
        char [] my_stringArray = my_string.toCharArray();
        
        int index = 0;
        char [] answerArray = new char[my_stringArray.length];
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_stringArray[i];//my_stringArray 배열 0부터 순차적으로  모음인지 비교할 초기값 설정
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                answerArray[index++] = my_stringArray[i];//answerArray 배열 0부터 모음이 아닌 것만 순차적으로 반환되도록 작성
            }
        }
            
                
        String answer = new String(answerArray,0,index);//answerArray 배열0부터 index까지만 문자열로 반환
        return answer;
    }
}