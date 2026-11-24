import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList3 {
    private LinkedList<Integer> num = new LinkedList<>();

    public LinkedList<Integer> getNum() {
        return num;
    }

    public void setNum(LinkedList<Integer> num) {
        this.num = num;
    }
    Scanner sc = new Scanner(System.in);
//Add 10 numbers
    public void addnum(){
        for (int i=0 ; i<10 ; i++){
            System.out.println("add the number : "+(i+1));
            int n = sc.nextInt();
        }
    }
//Calculate the sum
    public void sum(){
        int sum = 0 ;
        for (int numbers : num){
            sum += numbers ;
        }
    }
    //Calculate the averag.
    public void avr(){
        int sum = 0;
        for (int i =0 ;i<num.size();i++)
        {
            sum += num.get(i);
        }
        int avr = 0 ;
        if (!num.isEmpty()){
            avr = sum / num.size();
        }
    }
    //Find the maximum and minimum
    public void max(){
        int max = Integer.MAX_VALUE;
        for (int numbers : num){
           if (max<numbers){
               max = numbers ;
           }
        }
        System.out.println("the biggest number is : "+max);
    }
    public void min(){
        int min = Integer.MAX_VALUE;
        for (int numbers : num){
            if (min>numbers){
                min = numbers ;
            }
        }
        System.out.println("the biggest number is : "+min);
    }
    //Remove all negative numbers
    public void remonegative(){
        for (int numbers : num){
            if (numbers<0){
                num.remove(numbers);
            }
        }
    }
    //Sort numbers ascending
    public void ordered(){
     Collections.sort(num);
        System.out.println(num);
     }

}
