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
        ListNode sum = new ListNode(0);
        ListNode ans = sum;
        
        while(l1 != null && l2 != null){
            sum.val = (l1.val + l2.val + carry)%10;
            carry = (l1.val + l2.val + carry) / 10;
            if(l1.next != null || l2.next != null){
                sum.next = new ListNode(0);
                sum = sum.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        
        if(l1 != null){
            while(l1 != null){
                sum.val = (l1.val + carry)%10;
                carry = (l1.val + carry) / 10;
                if(l1.next != null){
                    sum.next = new ListNode(0);
                    sum = sum.next;
                }
                l1 = l1.next;    
            }    
        }
        else{
            while(l2 != null){
                sum.val = (l2.val + carry)%10;
                carry = (l2.val + carry) / 10;
                if(l2.next != null) {
                    sum.next = new ListNode(0);
                    sum = sum.next;
                }
                l2 = l2.next;    
            }
        }
        
        if(carry == 1){
            sum.next = new ListNode(1);
        }
        return ans;
    }
}