package com.chungchungdev.leetcode.editor.en

fun main() {
    val solution = RemoveDuplicatesFromSortedArray.Solution()
}

class RemoveDuplicatesFromSortedArray {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var value = Int.MIN_VALUE
        var index = 0
        for (i in nums.indices) {
            if (nums[i] > value) {
                value = nums[i]
                nums[index] = value
                index++
            }
        }
        return index
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}