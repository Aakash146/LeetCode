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
    public ListNode deleteMiddle(ListNode head) {
        ListNode node = head;
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(size == 1) return head.next;
        int pos = 0;
        while(node != null){
            if(pos == (size/2)-1){
                node.next = node.next.next;
                break;
            }
            node = node.next;
            pos++;
        }
        return head;
    }
}