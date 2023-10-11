// -------------Given a head node of Linked List return size----------

public class LinkedListSize {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
// --------Creat a Linked List  with n nodes with data 1 to N return head node?---------
    Node CreatListN(int n){
        Node h=new Node(1);
        Node l=h;
         for(int i=2; i<=n; i++){
            l.next=new Node(i);
               l=l.next;
         }
         return h;
        }

// -----Given Head Node of Linked List return Size ------------

    int LLSize(Node h){
        Node t=h;
        int c=0;
        while(t!=null){
            t=t.next;
            c++;
        }
        return c;
    }
        

    public static void main(String[] args) {
        LinkedListSize obj=new LinkedListSize();
        Node node=obj.CreatListN(5);
        int size = obj.LLSize(node);
        System.out.println(size);
    }
}
