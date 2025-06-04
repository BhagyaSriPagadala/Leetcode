
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        digits[n - 1] += 1;
        
        for (int i = n - 1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1] += 1;
            }
        }
        
        if (digits[0] == 10) {
            int[] result = new int[n + 1];
            result[0] = 1; 
            for (int i = 1; i < result.length; i++) {
                result[i] = 0; 
            }
            return result;
        }
        
        return digits;
    }
}
