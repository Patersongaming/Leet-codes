class Solution {
    public int majorityElement(int[] nums) {
        // Build a hashmap to keep count of each number
        HashMap<Integer, Integer> counts = new HashMap<>();

        //loop thru the array and ++ each one everytime that it passes that number
for (int num : nums){
    counts.put(num, counts.getOrDefault(num, 0)+1);

        
        // check which one is the highest.
        if (counts.get(num) > nums.length / 2){
            return num;
     
           }   
}
     return -1;  }
    
}
    //return the max
    
