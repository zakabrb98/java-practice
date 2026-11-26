import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ex3 {
    Scanner sc = new Scanner(System.in);
    LinkedHashSet <String> languages = new LinkedHashSet<String>();
    public void addlanguages(){
        for (int i =0 ; i<5 ; i++){
            System.out.println("enter ur "+(i+1)+" language : ");
            String name = sc.nextLine();
            languages.add(name) ;
        }
    }
    public LinkedHashSet<String> display() {return languages ;}
    public int size(){return languages.size();}
}
