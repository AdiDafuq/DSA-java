class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        
        int step1 = 1;
        int step2 = 2;
        
        for (int step3 = 3; step3 <= n; step3++) {
            int current = step1 + step2;
            step1 = step2;
            step2 = current;
        }
        
        return step2;
    }
}
