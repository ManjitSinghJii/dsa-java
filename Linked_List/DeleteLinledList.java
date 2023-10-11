// --------------------------Delete in Linkrd List----------------------

public class DeleteLinledList {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node creatNode(int n){
        Node h=new Node(1); 
        Node l=h;
        for(int i=2; i<=n; i++){
            l.next=new Node(i);
            l=l.next;
        }
        return h;
    }
// ---------------------- Delete Node-------------------------------------
    static Node deleted(Node head, int k){

        if(k==0){
            // head=head.next;
            // return head;
            return head.next;
        }

        else{
            Node t=head;
            for(int i=0; i<k; i++){
                t=t.next;
            }
            t.next=t.next.next;
        }
        return head;
    }


    public static void main(String[] args) {
        DeleteLinledList obj= new DeleteLinledList();
        Node node= obj.creatNode(5);
        Node ans = deleted(node, 2);
        System.out.println(ans);
    }
}
