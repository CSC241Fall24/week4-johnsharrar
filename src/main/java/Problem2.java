
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list
        if(head == null) {
            return new ListNode(val);
        }
        if(position == 1) {
            ListNode newNode = new ListNode(val);
            newNode.next = head;
            return newNode;
        }
        head.next = insert(head.next, val, position - 1);
        return head;
    }
}
