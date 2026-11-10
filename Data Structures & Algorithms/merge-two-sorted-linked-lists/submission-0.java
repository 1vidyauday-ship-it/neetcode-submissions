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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tmp = new ListNode();
        ListNode head = null;

        ListNode p1 = list1;
        ListNode p2 = list2;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                tmp.next = p1;
                 //System.out.println("p1 " + p1.val);
                p1 = p1.next;
            }
            else {
                tmp.next = p2;
                //System.out.println("p2 " + p2.val);
                p2 = p2.next;
               
            }
            tmp = tmp.next;
            if (head == null) head = tmp;
            
        }
        if (p1 != null) {
            tmp.next = p1;
            tmp = tmp.next;
            if (head == null) head = tmp;

        }
        if (p2 != null) {
            tmp.next = p2;
             tmp = tmp.next;
            if (head == null) head = tmp;

        }
        return head;
        
    }
}