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
    public boolean hasCycle(ListNode head) {
        ListNode prev=head;
        ListNode current=head;

        while(current != null && current.next != null){
            prev=prev.next;
            current=current.next.next;
            if(current == prev){return true;}
        }
        return false;
    }
}
