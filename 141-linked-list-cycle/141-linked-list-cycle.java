/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode current) {
        HashSet<ListNode> set = new HashSet<>();
        while(current != null){
            if(set.contains(current)) return true;
            else set.add(current);
            current = current.next;
        }
        return false;
    }
}