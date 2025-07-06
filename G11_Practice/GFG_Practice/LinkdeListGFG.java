// Node definition
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkdeListGFG {

    public Node insertInMiddle(Node head, int x) {
        Node newNode = new Node(x);

        // If the list is empty
        if (head == null) {
            return newNode;
        }

        int length = size(head);
        int mid = (length % 2 == 0) ? length / 2 : (length / 2) + 1;

        Node temp = head;

        // Move mid - 1 steps to reach the node after which to insert
        for (int i = 1; i < mid; i++) {
            temp = temp.next;
        }

        // Insert new node after 'temp'
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    public static int size(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Utility to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Utility to build a list from array
    public static Node buildList(int[] arr) {
        if (arr.length == 0)
            return null;

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }

    public static Node joinTheLists(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        // Add all nodes from first list
        while (head1 != null) {
            tail.next = new Node(head1.data);
            tail = tail.next;
            head1 = head1.next;
        }

        // Add all nodes from second list
        while (head2 != null) {
            tail.next = new Node(head2.data);
            tail = tail.next;
            head2 = head2.next;
        }

        return dummy.next; // skip dummy node
    }
    
    // Main method
    public static void main(String[] args) {
        LinkdeListGFG sol = new LinkdeListGFG();

        int[] input = { 1, 2, 4 }; // Linked list: 1 -> 2 -> 4
        int toInsert = 3;

        Node head = buildList(input);
        System.out.print("Before insertion: ");
        printList(head);

        head = sol.insertInMiddle(head, toInsert);

        System.out.print("After insertion: ");
        printList(head);
    }
}
