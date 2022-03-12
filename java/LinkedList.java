public class LinkedList {
    
    Node head; // reference variable
    static class Node{
        String str;
        Node next;
        Node(String s){str = s;}
    }

    public void printList(){
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.str + " ");
            tmp = tmp.next;
        }
    }
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.head = new Node("fname");
        Node second = new Node("lname");
        Node third = new Node("address");
        list.head.next = second;
        second.next = third;
        list.printList();

    }
}
