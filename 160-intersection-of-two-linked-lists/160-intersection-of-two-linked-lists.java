/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        ListNode currentB = headB;
        HashSet<ListNode> set = new HashSet<>();
        while(currentA != null || currentB != null){
            if(set.contains(currentA)){
                if(currentA != null) return currentA;
            }
            else{
                set.add(currentA);
            }
            if(set.contains(currentB)){
                if(currentB != null) return currentB;
            }
            else{
                set.add(currentB);
            }
            if(currentA != null) currentA = currentA.next;
            if(currentB != null) currentB = currentB.next;
        }
        return null;
    }
}