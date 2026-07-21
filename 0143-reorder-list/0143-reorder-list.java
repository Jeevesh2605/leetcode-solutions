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
        if(head==null || head.next==null){
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode dummy = slow.next;
        slow.next=null;

        ListNode prev =null;
        while(dummy!=null){
            ListNode next = dummy.next;
            dummy.next=prev;
            prev=dummy;
            dummy=next;
        }
        dummy=prev;
        ListNode first =head;
        while(dummy != null){
            ListNode temp1 = first.next;
            ListNode temp2 = dummy.next;
            first.next = dummy;
            dummy.next = temp1;
            first = temp1;
            dummy = temp2;
        }
    }
}