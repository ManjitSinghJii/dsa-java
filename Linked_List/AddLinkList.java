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

    // Print Link List................
    
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


void addFirst(int data){

    // Add First Node In LinkList.................

        Node temp = new Node(data);
        if(head == null){
            head = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
    }


    void addIndex(int index, int data){


        //       How to Add Element in Link List using Index.............


        if(index == 0){
            addFirst(data);
        }
        else{
            Node temp = new Node(data);
            int count = 0;
            //Node curr=this.head;
            Node curr=head;
            while (count < index-1) {
                curr = curr.next;
                count++;
            }
            temp.next=curr.next;
            curr.next=temp;
        }

    }




}

public class AddLinkList {
    public static void main(String[] args) {

        LinkList ll = new LinkList();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.addIndex(1, 100);

        ll.addFirst(5);
        ll.printLinkList();


    }
}
