class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class CircularLinkedList {
    private Node head = null;
    private Node tail = null;

    // 1. Insertion at the Beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) { 
            head = newNode;
            tail = newNode;
            tail.next = head; 
        } else {
            newNode.next = head;
            tail.next = newNode; 
            head = newNode; 
        }
    }

    // 2. Insertion at the End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) { 
            head = newNode;
            tail = newNode;
            tail.next = head; 
        } else {
            tail.next = newNode; 
            newNode.next = head; 
            tail = newNode; 
        }
    }

    // 3. Insertion After a Node
	
    public void insertAfter(int afterData, int data) {
		if (head == null) {
        System.out.println("List is empty.");
        return;
    }

    Node current = head;
    while (true) {
        if (current.data == afterData) {
            Node newNode = new Node(data);
            newNode.next = current.next;
            current.next = newNode;

            if (current == tail) {
                tail = newNode;
            }
            return;
        }
        current = current.next;
        if (current == head) { 
            break;
        }
    }
    System.out.println("Node with data " + afterData + " not found.");
}
	   /*Node current = head;
        do {
            if (current.data == afterData) {
                Node newNode = new Node(data);
                newNode.next = current.next;
                current.next = newNode;

                if (current == tail) { 
                    tail = newNode;
                }
                return;
            }
            current = current.next;
        } while (current != head);
        System.out.println("Node with data " + afterData + " not found.");
    }*/

    // 4. Deletion at the Beginning
    public void deleteAtBeginning() {
        if (head == null) { 
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) { 
            head = null;
            tail = null;
        } else {
            head = head.next; 
            tail.next = head; 
        }
    }

    // 5. Deletion at the End
    public void deleteAtEnd() {
        if (head == null) { 
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) { 
            head = null;
            tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = head; 
            tail = current; 
        }
    }

    // 6. Deletion After a Node
    public void deleteAfter(int afterData) {
        Node current = head;
        do {
            if (current.data == afterData) {
                if (current.next == head) { 
                    System.out.println("No node to delete after " + afterData);
                    return;
                }
                current.next = current.next.next;
                if (current.next == head) { 
                    tail = current;
                }
                return;
            }
            current = current.next;
        } while (current != head);
        System.out.println("Node with data " + afterData + " not found.");
    }

    // 7. Traversal
    public void traverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}
public class Circular_Linked_List {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        // Insertions
        cll.insertAtBeginning(10);
        cll.insertAtBeginning(5);
        cll.insertAtEnd(20);
        cll.insertAtEnd(25);
        cll.insertAfter(10, 15);

        System.out.println("Circular Linked List after insertions:");
        cll.traverse();

        // Deletions
        cll.deleteAtBeginning();
        cll.deleteAtEnd();
        cll.deleteAfter(10);

        System.out.println("Circular Linked List after deletions:");
        cll.traverse();
    }
}
