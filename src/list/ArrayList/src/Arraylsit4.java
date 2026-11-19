import java.util.ArrayList;
import java.util.Scanner;

public class Arraylsit4 {
    //Search for a Student
  Scanner sc = new Scanner(System.in);

  private ArrayList<String> names = new ArrayList<>();

    public ArrayList<String> getNames() {
        return names;
    }

    //add some names
    public void addnames(){
        names.add("ahmed");
        names.add("sofian");
        names.add("zaka");
        names.add("malik");
    }

    public void serchname(){
        System.out.println("enter the name u want to search : ");
        String n = sc.nextLine();
        if (names.contains(n)){
            System.out.println("ur name u enter is : "+n +" index of : "+names.indexOf(n));
        }
        else {
            System.out.println("this name not found ");
        }

    }


}
