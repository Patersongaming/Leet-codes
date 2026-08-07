import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final String[] Keypad = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        backtrack(result, new StringBuilder(), digits, 0);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder currentCombo, String digits, int index) {
        if (index == digits.length()) {
            result.add(currentCombo.toString());
            return;
        }

        String letters = Keypad[digits.charAt(index) - '0'];
        
        for (char letter : letters.toCharArray()) {
            currentCombo.append(letter);
            backtrack(result, currentCombo, digits, index + 1);
            currentCombo.deleteCharAt(currentCombo.length() - 1);
        }
    }
}