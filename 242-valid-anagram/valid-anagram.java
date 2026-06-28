class Solution {
    public boolean isAnagram(String s, String t) {
        // first i want to check if both are the same length.
        //I want to loop thru string s
        // then make a way to keep track of the chars in each one
        // then i will go through the secodn one in a loop
        // and i will check if this character has been seen and if not it will be return false
        if (s.length() != t.length()){
            return false;    
        }
        Map<Character, Integer> seen = new HashMap<>();
        for (int x = 0;x<s.length();x++){
            char c = s.charAt(x);
            seen.put(c , seen.getOrDefault(c,0)+1);
        }
        for(int i = 0; i< t.length(); i++){
            char c = t .charAt(i);
        if(seen.getOrDefault(c, 0) == 0){
            return false;
        } seen.put(c,seen.get(c)-1);
        }
return true;
    }
}