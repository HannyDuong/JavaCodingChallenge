import java.util.Arrays;

// public class LinkedList {
    
//     Node head; // reference variable
//     static class Node{
//         String str;
//         Node next;
//         Node(String s){str = s;}
//     }

//     public void printList(){
//         Node tmp = head;
//         while (tmp != null) {
//             System.out.print(tmp.str + " ");
//             tmp = tmp.next;
//         }
//     }
//     public static void main(String args[]){
//         LinkedList list = new LinkedList();
//         list.head = new Node("fname");
//         Node second = new Node("lname");
//         Node third = new Node("address");
//         list.head.next = second;
//         second.next = third;
//         list.printList();

//     }
// }


public class Linked{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public void push(int newNode){
        Node new_Node = new Node(newNode);
        new_Node.next = head;
        head = new_Node;

    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }


    public static void main(String [] args){
        Linked list = new Linked();
        list.push(5);
        list.push(1);
        list.print();
        

    }
}