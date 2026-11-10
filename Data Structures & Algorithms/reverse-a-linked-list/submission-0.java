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
    public ListNode reverseList(ListNode head) {
        ListNode tmp = null;
        while(head != null) {
            ListNode nxt = head.next;
            head.next = tmp;
            tmp = head;
            head = nxt;
        }
        return tmp;
    }
}
