class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; 
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false; 
            }
            slow = slow.next; 
            fast = fast.next.next; 
        }

        return true; 
    }

    public static void main(String[] args) {
        // Example 1: head = [3, 2, 0, -4], pos = 1
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; 

        LinkedListCycle solution = new LinkedListCycle();
        System.out.println("Cycle Detected (Example 1): " + solution.hasCycle(node1)); 

        // Example 2: head = [1, 2], pos = 0
        ListNode nodeA = new ListNode(1);
        ListNode nodeB = new ListNode(2);
        nodeA.next = nodeB;
        nodeB.next = nodeA; 

        System.out.println("Cycle Detected (Example 2): " + solution.hasCycle(nodeA)); 

        // Example 3: head = [1], pos = -1
        ListNode nodeC = new ListNode(1);

        System.out.println("Cycle Detected (Example 3): " + solution.hasCycle(nodeC)); 
    }
}
