class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){//배열의 인덱스를 설정하고 배열의 크기만큼 인덱스가 증가하도록 설정한다.
            if(array[i] > height){//해당 배열의 값이 머쓱이의 키보다 큰 경수 answer의 값이 1씩 증가하도록 한다.
                answer++;
            }
        }
        return answer;
    }
}