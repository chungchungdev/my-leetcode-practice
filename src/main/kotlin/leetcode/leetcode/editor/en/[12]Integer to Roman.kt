//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    val valueToRomanMap = mapOf(
        1 to 'I',
        5 to 'V',
        10 to 'X',
        50 to 'L',
        100 to 'C',
        500 to 'D',
        1000 to 'M',
    )

    val digitToRomanMap = mapOf(
        1 to "I",
        2 to "II",
        3 to "III",
        4 to "IV",
        5 to "V",
        6 to "VI",
        7 to "VII",
        8 to "VIII",
        9 to "IX",
    )

    fun intToRoman(num: Int): String {
        val roman = StringBuilder()
        var curr = num
        var digitPos = 1
        while (curr > 0) {
            val lastDigit = num % 10
            when (lastDigit) {
                in 1..3-> repeat(lastDigit) { digitToRomanMap[digitToRomanMap[curr]]!! }
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
