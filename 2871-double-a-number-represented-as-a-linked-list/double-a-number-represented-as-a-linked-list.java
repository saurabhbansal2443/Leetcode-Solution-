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
    public ListNode doubleIt(ListNode head) {
      
      if(head==null ){
          return head ;
      }

      Stack<ListNode> st = new Stack<>();

      ListNode temp = head ;

      while(temp!=null){
          st.push(temp);
          temp = temp.next;
      }

      int carry = 0 ;

      while(st.size()>0){
          ListNode curr = st.pop();

          int data = curr.val;

          int sum = data + data + carry;

          curr.val = sum%10;
          carry = sum/10;
      }

      if(carry!=0){
          ListNode nhead = new ListNode(carry);

          nhead.next = head ;

          return nhead ;
      }else{
          return head ;
      }



        
    }
}