package com.chungchungdev.leetcode.editor.en

import java.util.Stack

fun main() {
    val solution = ValidParentheses.Solution()
}

class ValidParentheses {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun isValid(s: String): Boolean {
        val bracketMap = mapOf(
            '(' to ')',
            '{' to '}',
            '[' to ']'
        )
        val input = Stack<Char>()
        for (char in s) {
            if (bracketMap.containsKey(char)) {
                input.push(char)
            } else {
                if (input.isEmpty()) return false
                if (char == bracketMap[input.peek()]) {
                    input.pop()
                } else {
                    return false
                }
            }
        }
        return input.isEmpty()
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}