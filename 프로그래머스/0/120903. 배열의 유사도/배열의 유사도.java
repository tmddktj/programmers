class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i1 = 0; i1 < s1.length; i1++){
            for(int i2 = 0; i2 < s2.length; i2++){
                if(s1[i1].equals(s2[i2]) ){//문자열 동등비교는 ==이 아닌 .equals() 사용
                    answer++;
                }
            }
        }
        return answer;
    }
}