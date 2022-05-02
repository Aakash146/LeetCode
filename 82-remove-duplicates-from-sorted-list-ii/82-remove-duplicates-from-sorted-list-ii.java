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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = new ListNode(0);
        ListNode ans = node;
        ListNode temp = head;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(temp != null){
            map.put(temp.val,map.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }
        while(head != null){
            if(map.get(head.val)==1){
                node.next = new ListNode(head.val);
                node = node.next;
            }
            head = head.next;
        }
        return ans.next;
    }
}