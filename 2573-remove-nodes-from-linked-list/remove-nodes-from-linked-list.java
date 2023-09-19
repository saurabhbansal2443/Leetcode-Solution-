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
    public ListNode removeNodes(ListNode head) {
        if(head==null || head.next==null){
            return head ;
        }

        Stack<ListNode> main = new Stack<>();

          ListNode temp = head ;

          while(temp!=null){
              main.push(temp);
              temp = temp.next;
          }

          ListNode dummy = new ListNode(main.peek().val);

            Stack<Integer> st = new Stack<>();

            st.push(main.pop().val);

            while(main.size()>0){
                int ele = main.pop().val;

                while(st.size()>0 && st.peek()<=ele){
                    st.pop();
                }

                if(st.size()==0){
                    ListNode temp2 = new ListNode(ele);
                    temp2.next = dummy;
                    dummy = temp2;
                }
                st.push(ele);
            }

            return dummy ;
    }
}