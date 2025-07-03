class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class LL {
    Node head;

    public void addAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteAtFirst() {
        if (isEmpty()) return;
        head = head.next;
    }

    public void deleteAtLast() {
        if (isEmpty()) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
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

    public boolean isEmpty() {
        return head == null;
    }

    public void printLL() {
        if (head == null) {
            System.out.println("Linked list is empty!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node reverseLL(Node headNode) {
        Node prev = null;
        Node curr = headNode;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
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
        linkedList.printLL();

        System.out.println("Is Empty: " + linkedList.isEmpty());

        linkedList.head = linkedList.reverseLL(linkedList.head);
        System.out.println("Reversed:");
        linkedList.printLL();
    }
}
