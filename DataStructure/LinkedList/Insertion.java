/* 
How to insert an element into a linked list?
    * At the front of the list
    * After a given node
    * At the end of the list

*/
package DataStructure.LinkedList;
import java.util.*;
public class Insertion {
    //pointer to the list
    Node head;
    // Class node
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    /* insert an item at the front of the list 
        1. allocate a new node and put the new data in a node
        2. set the pointer of the new node equals to head
        3. set head point to new node
        Time Complexity: O(1)

    */

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /* Insert after a given node
         1. allocate a new node and put the new data in a node
         2. set the pointer of the new node equals the previous node
         3. set previous node point to new node
         Time Complexity: O(1)
    */

    public  void InsertAfter(int data, Node pre_node){
        if(pre_node == null){
            System.out.println("Given node cannot be empty");
            return; //help preventing NullPointerException
        }
        Node new_Node = new Node(data);
        new_Node.next = pre_node.next;
        pre_node.next = new_Node;
    }

    /* Insert at the end of the list
        1. Allocate a new node memory and put the new data in the node
        2. if head == null then newNode == head and return
        3. Traverse throught the list to find the last node
        4. Set newNode pointer == null
        5. Set last pointer == newNode
        Time Complexity: O(n)
    
    */

    public void InsertLast(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node temp = head;
        
        while(temp.next !=null){
            temp = temp.next;

        }
        new_node.next = null;
        temp.next = new_node;
        return;
    }

    public void printList(){
        Node temp = head;
        while (temp !=null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Insertion list = new Insertion();
        list.push(5);
        list.push(3);
        list.push(4);
        System.out.print("Push method: ");
        list.printList();
        System.out.println();

        list.InsertAfter(8, list.head.next);
        System.out.print("Insert After method: ");
        list.printList();
        list.InsertLast(10);
        System.out.print("Insert End method: ");
        list.printList();

    }
}
