/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *      ListNode(int val) {
            this.val = val;
        }
 *     ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) { // both empty
            return null;
        } else if (list1 == null) { // list1 empty, append all of list2
            return list2; 
        } else if (list2 == null) { // list 2 empty
            return list1;
        } else { // both non-empty
            if (list1.val <= list2.val) {
                return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
            } else {
                return new ListNode(list2.val, mergeTwoLists(list1, list2.next));
            }
        }

        
    }
}