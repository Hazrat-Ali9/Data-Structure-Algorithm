class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--;
        while(k > 0){
            int step = cntSteps(n, curr, curr+1);
            if(step <= k){
                curr++;
                k -= step;
            }
            else{
                curr *= 10;
                k--;
            }
        }
        return curr;
    }
    int cntSteps(int n, long prefix1, long prefix2){
        int step = 0;
        while(prefix1 <= n){
            step += Math.min(n+1, prefix2) - prefix1;
            prefix1 *= 10;
            prefix2 *= 10;
        }
        return step;
    }
}

// k th smallest in lexigraphical java