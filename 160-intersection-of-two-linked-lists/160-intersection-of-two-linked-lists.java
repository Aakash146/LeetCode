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
        while(currentA != null){
            set.add(currentA);
            currentA = currentA.next;
        }
        while(currentB != null){
            if(set.contains(currentB)){
                return currentB;
            }
            else{
                set.add(currentB);
            }
            currentB = currentB.next;
        }
        return null;
    }
}