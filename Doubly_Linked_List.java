class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyLinkedList {
    private Node head = null;
    private Node tail = null;

    // 1. Insertion at the Beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) { 
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // 2. Insertion at the End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) { 
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // 3. Insertion in Between Nodes
    public void insertAfter(int afterData, int data) {
        Node current = head;
        while (current != null && current.data != afterData) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node with data " + afterData + " not found.");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode; 
        }
        current.next = newNode;
    }

    // 4. Deletion at the Beginning
    public void deleteAtBeginning() {
        if (head == null) { 
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) { 
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // 5. Deletion at the End
    public void deleteAtEnd() {
        if (tail == null) { 
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) { 
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // 6. Deletion in Between Nodes
    public void deleteNode(int data) {
        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node with data " + data + " not found.");
            return;
        }
        if (current == head) {
            deleteAtBeginning();
        } else if (current == tail) {
            deleteAtEnd();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // 7. Traversal (Forward)
    public void traverseForward() {
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

    // Traversal (Backward)
    public void traverseBackward() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}
public class Doubly_Linked_List {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insertions
        dll.insertAtBeginning(10);
        dll.insertAtBeginning(5);
        dll.insertAtEnd(20);
        dll.insertAtEnd(25);
        dll.insertAfter(10, 15);

        System.out.println("Doubly Linked List (Forward Traversal):");
        dll.traverseForward();

        System.out.println("Doubly Linked List (Backward Traversal):");
        dll.traverseBackward();

        // Deletions
        dll.deleteAtBeginning();
        dll.deleteAtEnd();
        dll.deleteNode(15);

        System.out.println("Doubly Linked List after deletions (Forward Traversal):");
        dll.traverseForward();

        System.out.println("Doubly Linked List after deletions (Backward Traversal):");
        dll.traverseBackward();
    }
}
