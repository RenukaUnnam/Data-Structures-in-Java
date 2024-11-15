class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DeleteOccurrenceInDoublyLinkedList {

    static Node deleteNode(Node head, Node delNode) {
        if (head == delNode) {
            head = delNode.next;
        }

        if (delNode.next != null) {
            delNode.next.prev = delNode.prev;
        }

        if (delNode.prev != null) {
            delNode.prev.next = delNode.next;
        }

        delNode = null;

        return head;
    }

    static Node deleteAllOccurOfX(Node head, int x) {
        if (head == null) {
            return null;
        }

        Node current = head;

        while (current != null) {
            Node next = current.next; 
            if (current.data == x) {
                head = deleteNode(head, current); 
            }
            current = next; 
        }

        return head;
    }

    
    static void printList(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating the doubly linked list
        Node head = new Node(2);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(10);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(8);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;
        head.next.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next.prev = head.next.next.next.next.next.next;

        System.out.println("Original List:");
        printList(head);

        int x = 2; 
        head = deleteAllOccurOfX(head, x);

        System.out.println("List after deleting all occurrences of " + x + ":");
        printList(head);
    }
}
