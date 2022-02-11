
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int result=0;
        while(temp!=null){
           result=(result<<1)+temp.val;
        
          temp=temp.next;      
        }
        return result;
    }
}
