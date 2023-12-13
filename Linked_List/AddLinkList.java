class Node{

    int data;
    Node next;

    Node(int data){
        // data=this.data;
        this.data=data;
        next=null;
    }
}

class LinkList{
    
    Node head;
    void printLinkList(){
        Node curr = this.head;
        while (curr != null) {
            System.out.println(curr.data);
             curr=curr.next;
        }
    }
    
    void add(int data){
        

        // How to add an element to linkList..............

        Node temp = new Node(data);

        if (head == null) {
            head = temp;
        }
        else{
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;

        }
    }
}

public class AddLinkList {
    public static void main(String[] args) {

        LinkList ll = new LinkList();

        ll.add(10);
        ll.add(20);
        ll.printLinkList();


    }
}
