class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class ConvertBinary {
    public int getDecimalValue(ListNode head) {
        int result = 0;

        while (head != null) {
            result = result * 2 + head.val;  
            head = head.next;
        }

        return result;
    }

    public static void main(String[] args) {
        ConvertBinary solution = new ConvertBinary();

        // Example 1: head = [1, 0, 1]
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
		printList(node1);
        System.out.println(solution.getDecimalValue(node1)); 

    }
	public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
