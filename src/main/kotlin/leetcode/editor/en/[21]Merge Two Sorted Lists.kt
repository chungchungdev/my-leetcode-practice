package com.chungchungdev.leetcode.editor.en

fun main() {
    val solution = MergeTwoSortedLists.Solution()
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class MergeTwoSortedLists {
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        // edge cases
        if (list1 == null) {
            return list2
        }
        if (list2 == null) {
            return list1
        }
        // general cases
        var l1 = list1
        var l2 = list2
        val dummyHead = ListNode(0)
        var curr:ListNode? = dummyHead
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                curr?.next = l2
                break
            }
            if (l2 == null) {
                curr?.next = l1
                break
            }
            if (l1.`val` < l2.`val`) {
                curr?.next = l1
                l1 = l1.next
            } else {
                curr?.next = l2
                l2 = l2.next
            }
            curr = curr?.next
        }
        return dummyHead.next
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}