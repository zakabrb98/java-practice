
public class Node{
    int data ;

    Node next ;

    Node prev ;
   public Node(int data){
       this.data = data ;
       this.next = null ;
       this.prev = null ;
   }
}
public class Doublelinkedlist{
    Node head ;
    public void addnode(int data ){
        Node newnode = new Node(data);
        if (head == null){
            head = newnode ;
            return;
        }
        Node current = head ;
        while (current.next!=null){
            current = current.next;
        }
        current.next = newnode;
        newnode.prev = current;
    }
    public void displayforward (){
        Node current = head ;
        while (current.next!= null){
            System.out.print(current.data + " --> ");
            current = current.next ;
        }
        if (current.next == null){
            System.out.println(current.data);
        }
        System.out.println("null");
    }
    public void displaybackward(){
        Node current = head ;
        if (current==null){
            return;
        }
        while (current.next!=null){
            current = current.next ;
        }
        while (current.prev !=null){
            System.out.print(current.data + " --> ");
            current = current.prev ;
        }
        if (current.prev == null){
            System.out.println(current.data);
        }
    }

}

void main() {
    Doublelinkedlist double1 = new Doublelinkedlist();
    double1.addnode(12121);
    double1.addnode(123122);
    double1.addnode(1213213);
    double1.addnode(2524524);
    double1.addnode(121212121);

    double1.displayforward();
    double1.displaybackward();
}