import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist2 {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Integer> numbers = new ArrayList<>();

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }
    public void addnumbers(){
        System.out.println("| enter 10 numbers here : ");
        for (int i =0 ; i<10; i++){
            System.out.print("Enter number "+(i+1)+" : ");

            int num = sc.nextInt();

            numbers.add(num);
        }
    }
    public void displaynum(){
        System.out.println("| ur 10 numbers : ");
        for (int i=0 ; i<10 ; i++){
            System.out.println("the "+i+" is : "+numbers.get(i));
        }
    }
    public void max(){
        System.out.println("| ur maximum numbers is : ");
        int max =numbers.get(0);
        for (int i=0 ; i<10; i++){
            if (numbers.get(i)>max){
                max=numbers.get(i);
            }
        }
        System.out.println(max);
    }
    public void maxpremethode(){
        System.out.println("| ur maximun numbers with advanced way : ");
        System.out.println("ur maximum number is : "+Collections.max(numbers));
    }
    public void minimum(){
        System.out.println("| ur minimum number in the Arraylist :" );
        int minimum =numbers.get(0);
        for (int i =0 ; i<10 ; i++){
            if (minimum>numbers.get(i)){
                minimum = numbers.get(i);
            }
        }
        System.out.println(minimum);
    }
    public void minimumpremethode(){
        System.out.println("| ur minimum number in pre methode : ");
        System.out.println("ur minimum number is : "+Collections.min(numbers));
    }
}
