package practice;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(int x, ListNode next) {
        val = x;
        next = next;
    }

    void print() {

        ListNode current = this;
        do {
            System.out.print(current.val + " ");
            current = current.next;
        }
        while (current.next != null);

        System.out.println(current.val);
        System.out.println();
    }
}
