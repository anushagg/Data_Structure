/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode current = head;
        ListNode fast = head;
        if (head == null){
            return false;
        }
		
            while(fast.next != null && fast.next.next != null){
			   
			    fast = fast.next.next;
			    current = current.next;
                 if(current == fast) {
				    return true;
			    }
            }
              
		
		return false;
    }
}
