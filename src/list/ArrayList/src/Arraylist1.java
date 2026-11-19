import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist1 {
    //Student Names

    Scanner sc = new Scanner(System.in);

    private ArrayList<String> students = new ArrayList<>();

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }
    public void addnames(){
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter student name: ");

                String name = sc.nextLine();

                students.add(name);
            }
        }
    public void printnames(){
        for (int i=0 ; i<5 ; i++){
            System.out.println("the "+(i+1)+" name is : "+students.get(i));
        }
    }
    public void firstandlast(){
        for (int i =0 ; i<5 ; i++){
            if (i==0 || i == 4){
                System.out.println("the "+(i+1)+" name is : "+students.get(i));
            }
        }
    }
    public void size(){
        System.out.println("the size of this ArrayList is : "+students.size());
    }
}
