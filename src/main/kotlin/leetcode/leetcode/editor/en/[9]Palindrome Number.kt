//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        if (x in 0..9) return true
        if (x in 10..99) return x % 11 == 0
        else {
            var old = x
            var new = 0
            while (old > 0) {
                val lastDigit = old % 10
                old /= 10
                new = new * 10 + lastDigit
            }
            return new == x
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
