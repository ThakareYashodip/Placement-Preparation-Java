import java.util.LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class LL {
    // Linked List a linear data structure where data is not stored in contigunuos
    // memory like array .
    // Instead of each contains data and the refernce of next data .
    // There are types of Linked List
    /*
     * 1) Singly Linked List
     * 2) Doubly Linked List
     * 3) Circular Linked List
     */

    /*
     * Methods in Linked List
     * 1) addAtFirst(
     * 2) isEmpty()
     * 3) deleteAtFirst()
     * 4) deleteAtLast()
     * 5) printLL()
     */

    Node head;

    // AddAtFirst()
    public void addAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // deleteAtFirst()
    public void deleteAtFirst() {
        if (isEmpty()) {
            return;
        }
        head = head.next;
    }

    public void deleteAtLast() {
        if (isEmpty()) {
            return;
        }
        // If only one node
        if (head.next == null) {
            head = null;
            return;
        }
        // Find second-to-last node
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null; // Remove the last node
    }

    
    // size()
    public int size() {
        if (head == null)
            return 0;
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // isEmpty()
    public boolean isEmpty() {
        return head == null;
    }

    // printLL()
    public void printLL() {
        if (head == null) {
            System.out.println("Linked list is empty !");
        }
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        LL linkedList = new LL();
        
        linkedList.addAtFirst(10);
        linkedList.addAtFirst(20);
        linkedList.addAtFirst(30);
        linkedList.addAtFirst(40);
        linkedList.addAtFirst(50);

        linkedList.printLL();
        linkedList.deleteAtFirst();

        System.out.println();
        linkedList.printLL();

        System.out.println(linkedList.isEmpty());
    }
}
