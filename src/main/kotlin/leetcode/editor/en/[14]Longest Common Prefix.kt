package com.chungchungdev.leetcode.editor.en

fun main() {
    val solution = LongestCommonPrefix.Solution()
}

class LongestCommonPrefix {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var minLength = 200
        for (str in strs) {
            if (str.length < minLength) {
                minLength=str.length
            }
        }

        val sb = StringBuilder(minLength)

        repeat(minLength) { i->
            for (str in strs) {
                if (strs[0][i] != str[i]) {
                    return sb.toString()
                }
            }
            sb.append(strs[0][i])
        }
        return sb.toString()
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}