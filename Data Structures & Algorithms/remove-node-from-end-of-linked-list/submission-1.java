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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //get list size
        int l = 0;
        ListNode tmp = head;
        while (tmp!=null) {
            tmp = tmp.next;
            l++;
        }
        //System.out.println("size " + n);
        //minus n from size
        int k = l - n;
        //traverse to n-1 node
        
        if (l == 1 && n == 1 ) return null;
        if (l == n) {
            return head = head.next;
        }
        
        int c = 1;
        ListNode curr = head;
        while (c < k) {
            curr = curr.next;
            c++;
        }
        
        if (curr.next!=null)
        curr.next = curr.next.next;
        else {
            curr.next = null;
        }
        //current next is n next
        return head;
    }
}
