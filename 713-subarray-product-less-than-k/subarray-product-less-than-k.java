class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k<= 1) return 0;
        int left = 0;
        int currentWindow = 1 ;
        int totalValidSubarrays =0;

        for(int right = 0; right <nums.length; right++){
            currentWindow = currentWindow * nums[right];
            while(currentWindow >= k){
                currentWindow = currentWindow/nums[left];
                left++;
            }
            totalValidSubarrays += (right - left +1);
        }
        return totalValidSubarrays;
    }
}