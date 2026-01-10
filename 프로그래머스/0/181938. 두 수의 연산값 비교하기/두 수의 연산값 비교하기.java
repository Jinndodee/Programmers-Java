class Solution {
    public int solution(int a, int b) {
        int plusCase = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int multiplyCase = 2 * a * b;
        return plusCase > multiplyCase ? plusCase : multiplyCase;
    }
}