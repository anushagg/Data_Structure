/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode prev = head;
        ListNode current = head.next;
        ListNode prevtemp, curtemp;
        while(current != null && current.next != null){
            prevtemp = prev.next;
            curtemp = current.next.next;
            prev.next = current.next;
            prev = current.next;
            prev.next = prevtemp;
            current.next = curtemp;
            current = curtemp;
        }
        return head;
    }
}
