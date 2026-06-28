class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> seen = new HashMap<>();

        for(char c : magazine.toCharArray()){
            seen.put(c, seen.getOrDefault(c,0)+1);
        }

        for(int i = 0; i< ransomNote.length();i++)
        {
            char c = ransomNote.charAt(i);
            int count = seen.getOrDefault(c,0);
            if (count ==0){
                return false;
            }
            seen.put(c, count-1);
        }
return true;
    }
    }
