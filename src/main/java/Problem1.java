// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        if (l1 == null) {
            return l2;
        }
        ListNode base = l1;
        while (base.next != null) {
            base = base.next;
        }
        base.next = l2;
        return l1;
    }
}