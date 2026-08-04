
public class LeetCodeQuestion2 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 //Conditinal Approch
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
         ListNode  current=null;ListNode  result=current;     
        while(l1 != null || l2 != null  || carry !=0){
            int x= (l1 !=null) ? l1.val : 0;
            int y = (l2 !=null) ? l2.val : 0;
            int sum= x + y + carry;
            carry = sum /10;
            if (current ==null){
                current = new ListNode(sum%10,null);
                result= current;
            }else{
                current.next = new  ListNode(sum%10,null);
                current =current.next;
            }
            l1=(l1 !=null) ? l1.next : null;
            l2=(l2 !=null) ? l2.next : null;
        }
        return result;
    }
    //Dummy Node Approch
    public ListNode addTwoNumberWithDummyNode(ListNode l1,ListNode l2){
        int carry =0;
        ListNode result =new ListNode(0,null);
        ListNode current = result;
        while(l1 !=null || l2 !=null || carry !=0){
            int x = (l1 !=null) ? l1.val :0;
            int y =(l2 != null) ? l2.val :0;
            int sum =x + y + carry ;
            carry = sum /10;
            current.next= new ListNode(sum % 10,null);
            current=current.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 =(l2 != null ) ? l2.next : null ;
        }
        return result.next;
    }
}
