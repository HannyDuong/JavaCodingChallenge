public class NthElementLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
{
    data = d;
    next = null;
}    }

public static void printList(Node head){
    Node temp = head;
    while(temp !=null){
        System.out.print(temp.data +" ");
        temp = temp.next;
    }
}

public static void main(String[] args) {
    

    Node head = new Node(1);
    Node one = new Node (2);
    Node two = new Node(3);
    head.next = one;
    one.next= two; 
    
    printList(head);
}

}
