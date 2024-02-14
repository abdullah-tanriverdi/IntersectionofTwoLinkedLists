
public class Main {
    public static void main(String[]args){
        // Creating sample linked list nodes

        ListNode commonNode=new ListNode(5);

        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = commonNode;

        ListNode headB = new ListNode(3);
        headB.next = commonNode;

        Solution solution=new Solution();

        // Calling the function that finds the intersection point
        ListNode intersectionNode=solution.getIntersectionNode(headA,headB);

       if (intersectionNode!=null){
           System.out.println("Intersection Node Value:"+intersectionNode.val);
       }else {
           System.out.println("No intersection found.");
       }
       
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val =x;
        next=null;
    }
}

class Solution{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){

        ListNode firstPointer=headA;
        ListNode secondPointer=headB;

        // Pointers are advanced to find the intersection of two linked lists.
        while (firstPointer!=secondPointer){

            firstPointer=(firstPointer!=null)?firstPointer.next: headB;
            secondPointer=(secondPointer!=null)?secondPointer.next:headA;
        }

        return firstPointer;
    }
}