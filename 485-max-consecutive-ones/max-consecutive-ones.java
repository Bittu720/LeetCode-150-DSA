class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcnt = 0;
        int curCnt = 0;
        for(int n:nums){
            if(n==1){
                curCnt++;
            }else{
                maxcnt = Math.max(maxcnt,curCnt);
                curCnt =0;
            }
        }
        return maxcnt>curCnt ? maxcnt : curCnt;
    }
}