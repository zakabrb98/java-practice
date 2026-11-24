
public class Node{
  private int data ;
  private Node node ;

   public int getData() {
     return data;
   }

   public Node getNode() {
     return node;
   }

   public Node(int data) {
     this.data = data;
     this.node = null ;
   }
 }
 public class Linked1{
  private Node head ;

   public Node getHead() {
     return head;
   }
    public void insert(int item ){
   Node n1 = new Node(item);
     if (head==null){
       head = n1 ;
     }
     else {
       Node checker = head ;
       while (checker.node !=null){
         checker = checker.node ;
       }
       checker.node = n1 ;
     }
    }
    public void shownode(){
     Node current = head ;
     while (current!=null){
       System.out.println( " this data :  " + current.data );
       current = current.node ;
     }
      System.out.println("null");
    }
    public void sizenode(){
       int check =0 ;
       Node checker = head ;
       while (checker != null){
           check += 1 ;
           checker = checker.node;
       }
        System.out.println("the size of this node is : "+check);
    }
    public boolean searchvalue(int value ) {
        Node search = head;
        while (search != null) {
            if (search.getData() == value) {
                System.out.println("ur value is founded " + value);
                return true ;
            }
            search = search.node;
        }
        return false ;
    }
    public void deletevalue(int value){
       Node delete = head ;
       while (delete !=null){
           if (delete.getData()==value){
               delete=null ;
           }
       }
    }
 }
  void main() {
  Linked1 linked1 = new Linked1();
  linked1.insert(19);
  linked1.insert(12);
  linked1.insert(13);
  linked1.insert(22);
  linked1.shownode();
  linked1.sizenode();
  System.out.println(linked1.searchvalue(12));
  }
