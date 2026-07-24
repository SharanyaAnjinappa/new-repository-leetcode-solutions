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
    public ListNode detectCycle(ListNode head) {
        ListNode l=head;
        ListNode r=head;
        while(r!=null && r.next!=null){
            l=l.next;
            r=r.next.next;
            if(l==r){
                ListNode ptr=head;
                while(ptr!=l){
                    ptr=ptr.next;
                    l=l.next;
                }
                return ptr;
            }
        }
        return null;
    }
}