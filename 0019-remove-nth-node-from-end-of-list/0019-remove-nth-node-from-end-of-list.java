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
        int i = 1;
        int count = 1;
        
        ListNode res = head;
        ListNode temp = head;
        
        if(head.next == null){
            return null;
        }
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        
        if(count == n){
            head = head.next;
            return head;
        }
        head = res;
        
        while(res != null){
            if(i == count - n){
                res.next = res.next.next;
                break;
            }else{
                res = res.next;
                i++;
            }
            
        }
        return head;
    }
}