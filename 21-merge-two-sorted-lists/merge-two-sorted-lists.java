
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp = new ListNode(0);//there should be an element before creating list
        ListNode curr=temp;
        while(list1 !=null && list2 !=null)//both list should'nt be empty for comparison
        {
            if(list1.val<=list2.val)
            {
               curr.next=list1;
                list1=list1.next;//next element proceding in list 1
                
            }
            else
            {
                curr.next=list2;
                list2=list2.next;//next element proceding in list 2
            }
            curr=curr.next;//next element proceeding in temp list for storing

        }
         //if list1 has elements
        if (list1 != null) {
            curr.next = list1;
        }
        //if list2 has elements
        if (list2 != null) {
            curr.next = list2;
        }

        return temp.next;
        //curr ele 0 curr.next is the merged list hence temp.next
        
    }
}