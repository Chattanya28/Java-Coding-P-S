public boolean isPalindrome(int x) {
    String str = String.valueOf(x);
    int left = 0;
    int right = str.length() - 1;
    
    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

//Alternative way the optimal one
// class Solution {
//     public boolean isPalindrome(int x) {
//         // Negative numbers and numbers ending with 0 (except 0 itself) are not palindromes
//         if (x < 0 || (x % 10 == 0 && x != 0)) {
//             return false;
//         }
        
//         int reversedHalf = 0;
//         while (x > reversedHalf) {
//             reversedHalf = reversedHalf * 10 + x % 10;
//             x /= 10;
//         }
        
//         // For odd length numbers, ignore middle digit by comparing x with reversedHalf/10
//         return x == reversedHalf || x == reversedHalf / 10;
//     }
// }

