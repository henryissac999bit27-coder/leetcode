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
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode prev=null;
        ListNode curr=slow;
        ListNode nn=null;

        while(curr!=null){
            nn=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nn;
        }
        ListNode first=head;
        ListNode sec=prev;
        while(sec!=null){
            if(first.val!=sec.val){
                return false;
            }
            first=first.next;
            sec=sec.next;
        }
        return true;
    }
}