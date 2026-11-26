/**You have an ArrayList containing duplicate numbers
 Use LinkedHashSet to remove duplicates
 without changing the original insertion order**/
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Ex1 {
     ArrayList<Integer> num = new ArrayList<>();

    public void addnum(){
        num.add(12);
        num.add(12);
        num.add(1);
        num.add(1);
        num.add(2);
        num.add(2);
        num.add(3);
        num.add(3);
        num.add(4);
        num.add(4);
        num.add(5);
        num.add(5);
        num.add(99);
    }
    public void display(){
        System.out.println("Ur arraylist : ");
       for (int i=0 ; i<num.size() ;i++){
           System.out.print(num.get(i)+" --> ");
       }
        System.out.println("NULL");
    }
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
    public void addnum1(){
        lhs.addAll(num);
    }
    public void display1(){
        for (Object e : lhs){
            System.out.print(e + " --> ");
        }
        System.out.println("NULL");
    }
}
