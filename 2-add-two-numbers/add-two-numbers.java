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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode add=new ListNode(0);
        ListNode curr=add;
        int carry=0;
        while(l1 != null || l2 !=null || carry!=0)
        {   
            int sum=carry;//carry from the previous sum is added to sum
           if(l1 != null)
           {
            sum+=l1.val;
            l1=l1.next;
           }
           if(l2 != null)//use "if" not "else" cause l2 should also be added 
           {
            sum+=l2.val;
            l2=l2.next;
           }
            carry = sum / 10;//check carry for the updated sum
            curr.next = new ListNode(sum % 10);
            //can't store the rem as int directly so convert it into a node

           curr=curr.next;
        }
        return add.next;
    }
}