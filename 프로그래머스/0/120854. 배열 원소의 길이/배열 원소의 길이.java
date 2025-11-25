class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++){
            answer[i]=strlist[i].length();//문자열 배열의 각 원소의 크기 구할 때 .length()사용하면됨.
        }
        return answer;
    }
}