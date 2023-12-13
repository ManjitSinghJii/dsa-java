class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class CreatLink_List {
    public static void main(String[] args) {
        Node p1 = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);

        Node head = p1;

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println(p1.next);
        System.out.println(p2.next);
        System.out.println(p3.next);
        System.out.println(p4.next);

        p1.next=p2;
        p2.next=p3;
        p3.next=p4;

        System.out.println(p1.data);
        System.out.println(p2.data);
        System.out.println(p3.data);
        System.out.println(p4.data);

        System.out.println(p1.next);
        System.out.println(p2.next);
        System.out.println(p3.next);
        System.out.println(p4.next);

    }
}