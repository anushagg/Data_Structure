/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int count = 0;
        int result = 0;
        while(current!= null){
            count++;
            current = current.next;
        }
        current = head;
        int resultcount = 0;
        while(resultcount != count/2){
            resultcount++;
            current = current.next;
        }
        return current;
    }
}
