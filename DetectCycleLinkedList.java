package java11_6_2025;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class DetectCycleLinkedList {

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move by 1
            fast = fast.next.next;     // move by 2

            if (slow == fast) {
                return true;           // cycle detected
            }
        }

        return false; // no cycle
    }

    public static void main(String[] args) {
        // Create linked list: 1 → 2 → 3 → 4 → 2 (cycle)
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next; // creates cycle

        System.out.println("Cycle exists? " + hasCycle(head)); // Output: true
    }
}

