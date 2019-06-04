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
        if(count/2 == 0){
            result = count/2 + 1;
        }
        else{
            result = count/2 + 1;
        }
        int resultcount = 0;
        while(current!= null){
            resultcount++;
            if(resultcount == result){
                return current;
            }
            current = current.next;
        }
        return current;
    }
}
