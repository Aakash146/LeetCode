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
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0; 
        ListNode sum = new ListNode(0); // dummy head
        ListNode ans = sum;
        while (l1 != null || l2 != null || carry != 0) { // termination condition is critical
            if (l1 != null) {
                carry = carry + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry = carry + l2.val;
                l2 = l2.next;
            }
            sum.next = new ListNode(carry % 10);
            sum = sum.next;
            carry = carry / 10;
        }
        
        return ans.next;
    }
}