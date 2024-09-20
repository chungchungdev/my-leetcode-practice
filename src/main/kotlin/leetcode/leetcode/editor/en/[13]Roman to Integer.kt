//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun romanToInt(s: String): Int {
        val symbolToIntMap = mutableMapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
        var num = 0
        for (i in s.indices) {
            if (i != s.lastIndex) {
                if (symbolToIntMap[s[i + 1]]!! / symbolToIntMap[s[i]]!! == 5 || symbolToIntMap[s[i + 1]]!! / symbolToIntMap[s[i]]!! == 10) {
                    num -= symbolToIntMap[s[i]]!!
                } else {
                    num += symbolToIntMap[s[i]]!!
                }
            } else {
                num += symbolToIntMap[s[i]]!!
            }
        }
        return num
    }
}
//leetcode submit region end(Prohibit modification and deletion)
