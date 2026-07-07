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
        ListNode mid=middleNode(head);
        ListNode mid_next=mid.next;
        mid.next=null;
        ListNode temp2=reverseList(mid_next);
        ListNode temp1=head;
        
        while(temp1!=null&&temp2!=null){
        if(temp1.val!=temp2.val){
            return false;
        } 
        temp1=temp1.next;
        temp2=temp2.next;
        }
        return true;
    }   
     public ListNode middleNode(ListNode head){   
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
          return slow;
    }     
  public ListNode reverseList(ListNode head) {
        ListNode h2=null;
        ListNode temp=head;
        
        while(temp!=null){
           head=head.next;
            temp.next=h2;
            h2=temp;
            temp=head;
            
        }
       return h2;
    }
}