// Creat a Linked List  with n nodes with data 1 to N return head node?

public class CreatLinkList {
   
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node CreateList(int n){
        Node h=new Node(1);
        Node l=h;
        for(int i=2; i<=n; i++){
            l.next=new Node(i);
            l=l.next;
        }
        return h;
    }
    public static void main(String[] args) {
        CreatLinkList obj= new CreatLinkList();
        Node node = obj.CreateList(5);
        System.out.println(node);
    }
   
}