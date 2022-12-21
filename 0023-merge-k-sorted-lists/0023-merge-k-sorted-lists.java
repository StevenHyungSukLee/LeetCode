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
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<Integer> pq = new PriorityQueue<>((x,y)-> x-y);
        
        for(ListNode node:lists){
            ListNode cur = node;
            while(cur != null){
                pq.add(cur.val);
                cur = cur.next;
            }
        }
        
        ListNode temp = new ListNode();
        ListNode cur = temp;
        
        while(!pq.isEmpty()){
            temp.next =  new ListNode(pq.poll());
            temp = temp.next;
        }
        
        return cur.next;
    }
}