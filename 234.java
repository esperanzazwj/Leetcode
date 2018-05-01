/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast,slow;
        fast=slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null) slow=slow.next;
        slow=reverse(slow);
        fast=head;
        while(slow!=null){
            if(slow.val!=fast.val)
                return false;
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}