/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode sp = head;
        ListNode dp = head;

        while (sp != null && dp != null && dp.next!=null) {
         sp = sp.next;
         dp = dp.next.next;
        if (sp.equals(dp)) return true;
        }
        return false;
    }
}
