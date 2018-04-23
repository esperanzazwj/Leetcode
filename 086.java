/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0),dummy2=new ListNode(0);
        ListNode p1=dummy1,p2=dummy2;
        while(head!=null){
            if(head.val<x){
                p1=p1.next=head;
            }
            else p2=p2.next=head;
            head=head.next;
        }
        p2.next=null;
        p1.next=dummy2.next;
        return dummy1.next;
    }
}