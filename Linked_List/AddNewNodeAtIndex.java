// --------Given a Linked List insert a new Node with data value v and index at P--------------------  

public class AddNewNodeAtIndex {

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

//-----------------Insert a new node-------------------------------


    static Node inserted(Node h, int v, int p){

        Node n=new Node(v);

        if(p==0){
            n.next=h;
            n=h;
            return h;
        }

        
        else{
            Node t=h;
            for(int i=1; i<p; i++){
                t=t.next;
            }
            n.next=t.next;
            t.next=n;
        }
        return h;

    }
    public static void main(String[] args) {
        AddNewNodeAtIndex obj=new AddNewNodeAtIndex();
        Node node=obj.creatNode(5);
        //Node ans=inserted(node,10,0);
        Node ans=inserted(node,10,2);
        System.out.println(ans);
    }
}
