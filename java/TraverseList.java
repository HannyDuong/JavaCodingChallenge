// create a Linked list that has three nodes
// Traverse the list and print the data
public class TraverseList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){data = d;}
    }

    public void printList(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
    // add a new node in front of the list
    public void push(int newData){
        Node new_node = new Node(newData);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
         TraverseList list = new TraverseList();
         list.head = new Node(4);
         Node second = new Node(9);
         Node third = new Node(1);
         list.head.next = second;
         second.next = third;
         list.printList();
         list.push(12);
         System.out.println("\n added new node");
         list.printList();
         


    }
}
