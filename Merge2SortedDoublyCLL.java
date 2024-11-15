class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyCircularLinkedList {
    Node head;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node last = head.prev;

            last.next = newNode;
            newNode.prev = last;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    public void display() {
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

    public static Node mergeLists(Node head1, Node head2) {
        
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        Node last1 = head1.prev;
        Node last2 = head2.prev;

        Node lastNode = (last1.data < last2.data) ? last2 : last1;

        last1.next = null;
        last2.next = null;

        Node finalHead = mergeSortedDoublyLists(head1, head2);

        finalHead.prev = lastNode;
        lastNode.next = finalHead;

        return finalHead;
    }

    private static Node mergeSortedDoublyLists(Node head1, Node head2) {
        Node dummy = new Node(0); 
        Node tail = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1.prev = tail;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2.prev = tail;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        if (head1 != null) {
            tail.next = head1;
            head1.prev = tail;
        }
        if (head2 != null) {
            tail.next = head2;
            head2.prev = tail;
        }

        Node mergedHead = dummy.next;
        if (mergedHead != null) {
            mergedHead.prev = null;
        }
        return mergedHead;
    }
}
public class Merge2SortedDoublyCLL {
    public static void main(String[] args) {
        DoublyCircularLinkedList list1 = new DoublyCircularLinkedList();
        DoublyCircularLinkedList list2 = new DoublyCircularLinkedList();

        // Inserting data into List 1
        list1.insertAtEnd(1);
        list1.insertAtEnd(3);
        list1.insertAtEnd(5);
        System.out.println("List 1:");
        list1.display();

        // Inserting data into List 2
        list2.insertAtEnd(2);
        list2.insertAtEnd(4);
        list2.insertAtEnd(6);
        System.out.println("List 2:");
        list2.display();

        // Merging the lists
        Node mergedHead = DoublyCircularLinkedList.mergeLists(list1.head, list2.head);

        System.out.println("Merged List:");
        DoublyCircularLinkedList mergedList = new DoublyCircularLinkedList();
        mergedList.head = mergedHead;
        mergedList.display();
    }
}
