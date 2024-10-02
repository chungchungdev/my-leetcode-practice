package com.chungchungdev.leetcode.editor.en

fun main() {
    val solution = TwoSum.Solution()
}

class TwoSum {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val complementToIndexMap: MutableMap<Int, Int> = mutableMapOf()
        for (i in nums.indices) {
            if (complementToIndexMap.containsKey(nums[i])) {
                return intArrayOf(complementToIndexMap[nums[i]]!!, i)
            }
            complementToIndexMap[target - nums[i]] = i
        }
        throw IllegalArgumentException("No solution found")
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    
}