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
    public void reorderList(ListNode head) {
        //get the length of the list
        int l = getLength(head);
         if (l <= 2) return;
        ListNode secondList = divideList(head, l);
        secondList = reverseList(secondList);
        head = weaveLists(head, secondList );
        
    }

    int getLength(ListNode head) {
        int ret = 0;
        ListNode tmp = head;

        while(tmp!=null) {
            tmp = tmp.next;
            ret++;
        }
        return ret;
    }
    ListNode divideList(ListNode head, int l){
        int k = l/2;
        int c = 0;

        ListNode tmp = head;
        while (c < k) {
            tmp = tmp.next;
            c++;
        }
        ListNode ret = tmp.next;
        tmp.next = null;
        return ret;

    }

    ListNode reverseList(ListNode head) {
        ListNode tail = null;
      
        while (head != null) {
            //save head next
            ListNode nxt = head.next;
            //head next = tail
            head.next = tail;
            //tail is head
            tail = head;
            //head is head next
            head = nxt;
        }
        return tail;
    }
    
    ListNode  weaveLists(ListNode head,ListNode secondHead ) {
      
        ListNode tail = new ListNode();
        ListNode tmpHead = tail;
        while(head != null && secondHead != null) {
            //save head next
            ListNode nxt = head.next;
            //save secondlIst next
            ListNode snxt = secondHead.next;
            tail.next = head;
            tail = tail.next;
            tail.next = secondHead;
            tail = tail.next;
            head = nxt;
            secondHead = snxt;
          
            
        }
        if (head!=null) tail.next = head;
        if (secondHead!=null) tail.next = secondHead;
        
        return tmpHead.next;
     }
}
