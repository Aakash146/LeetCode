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
    public ListNode swapPairs(ListNode head) {
        ListNode node = head;
        while(node != null && node.next != null){
            ListNode temp = new ListNode(0);
            
            temp.val = node.val;
            node.val = node.next.val;
            node.next.val = temp.val;
            
            node = node.next.next;
        }
        
        return head;
    }
}