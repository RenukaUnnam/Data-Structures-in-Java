class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
	public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
	public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
	public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            insertAtBeginning(data);
        } else {
            Node temp = head;
            for (int i = 1; i < position && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            } else {
                System.out.println("Position out of bounds");
            }
        }
    }

    public void deleteAtBeginning() {
        if (head != null) {
            head = head.next;
        }
    }
	public void deleteAtEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }
	public void deleteAtPosition(int position) {
        if (head == null) return;
        if (position == 0) {
            deleteAtBeginning();
        } else {
            Node temp = head;
            for (int i = 1; i < position && temp.next != null; i++) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            } else {
                System.out.println("Position out of bounds");
            }
        }
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}


public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtPosition(15, 1);

        System.out.println("Linked List:");
        list.traverse();

        System.out.println("Size: " + list.size());

        System.out.println("Searching for 15: " + list.search(15));
        System.out.println("Searching for 25: " + list.search(25));

        list.deleteAtPosition(1);
        System.out.println("After Deletion:");
        list.traverse();
    }
}
