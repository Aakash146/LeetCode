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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sorted = new ListNode(0);
        ListNode current = sorted;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                sorted.next = list1;
                sorted = sorted.next;
                list1 = list1.next;
            }
            else{
                sorted.next = list2;
                sorted = sorted.next;
                list2 = list2.next;
            }
        }
        if(list1 != null){
            while(list1 != null){
                sorted.next = list1;
                sorted = sorted.next;
                list1 = list1.next;
            }
        }
        else if(list2 != null){
            while(list2 != null){
                sorted.next = list2;
                sorted = sorted.next;
                list2 = list2.next;
            }
        }
        return current.next;
    }
}