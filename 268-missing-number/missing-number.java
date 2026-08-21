class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;;
        // create a hashmap 
        HashMap<Integer, Integer> counts = new HashMap<>();
        // put each number from 0 to n into the hashmap and make their value 0
        for(int i = 0; i <= n;i++){
            counts.put(i,0);

        }
        for(int num:nums){
            counts.put(num, counts.get(num)+1);
        }
        //go through the array of numbers and each time a number from 0 to nums is seen add ++ to that value
        for (int i = 0; i <= n;i++){
            if (counts.get(i)==0){
                return i;
            }
        }
        // after loop is done go through the array and return all number that are still at the value of 0
    
    return -1;}
}