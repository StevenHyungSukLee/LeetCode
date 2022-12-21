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
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode temp = null;
        while(second != null){
            temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }
        
        ListNode start = head;
        ListNode end = prev;
        
        while(end != null){
            ListNode tmp1 = start.next;
            ListNode tmp2 = end.next;
            
            start.next = end;
            end.next = tmp1;
            
            start = tmp1;
            end = tmp2;
        }
        
    }
}