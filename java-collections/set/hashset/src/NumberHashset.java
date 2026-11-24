import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NumberHashset {
    List <Integer> num = new ArrayList<>();
     public void addnnum(){
         num.add(1);
         num.add(1);
         num.add(2);
         num.add(2);
         num.add(3);
         num.add(4);
         num.add(4);
     }
     public void printlist(){
       for (Object e : num){
           System.out.print("this the ArrayList : "+e+" --> ");
       }
         System.out.println("null");
     }
     HashSet<Integer> num1 = new HashSet<>();
     public void trans(){
         num1.addAll(num);
     }
    public void printset(){
        for (Object e : num1){
            System.out.print("this the HashList : "+e+" --> ");
        }
        System.out.println("null");
    }


}
