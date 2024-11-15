import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList<>();

        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        int start = 0;
        int end = values.size() - 1;
        while (start < end) {
            if (!values.get(start).equals(values.get(end))) {
                return false; 
            }
            start++;
            end--;
        }

        return true; 
    }

    public static void main(String[] args) {
        PalindromeLinkedList solution = new PalindromeLinkedList();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
		printList(node1); 
        System.out.println(solution.isPalindrome(node1)); 

        
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
