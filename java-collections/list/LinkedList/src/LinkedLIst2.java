import java.util.LinkedList;
import java.util.Scanner;

public class LinkedLIst2 {
    private LinkedList<String> name = new LinkedList<>();

    public LinkedList<String> getName() {
        return name;
    }

    public void setName(LinkedList<String> name) {
        this.name = name;
    }
    Scanner sc = new Scanner(System.in);
//dd 5 student names
    public void addname(){
        for (int i=0 ; i<5 ; i++){
            System.out.print("enter ur "+(i+1)+" name : ");
            String n = sc.nextLine();
            name.add(n);
        }
    }
    //Print all students
    public void priintname(){
        for (int i=0 ; i<5 ; i++){
            System.out.print("ur "+(i+1)+" name is : "+name.get(i));
        }
    }
    //Print the first and last student
    public void firstandlast(){
        System.out.println("the first name is : "+name.getFirst());
        System.out.println("the last name is : "+name.getLast());
    }
   // Print the list size
    public void listsize(){
        System.out.println("the size of the list is : "+name.size());
    }
    //Check if "Ahmed" exists
    public void checkahmed(){
      if (name.contains("ahmed")){
          System.out.println(" the LinkedList contains : "+name.contains("ahmed"));
    }
      else {
          System.out.println("the LinkedList doesn't contains : ahmed ");
      }
    }

}
