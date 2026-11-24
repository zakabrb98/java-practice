import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist3 {
    //Product Prices
    Scanner sc = new Scanner(System.in);

    private ArrayList<Float> price = new ArrayList<>();

    public ArrayList<Float> getPrice() {
        return price;
    }

    //Add 5 product prices

    public void price( ){
        System.out.println("enter price here : ");
    for (int i=0 ; i<5 ; i++){
        System.out.println("the price number "+(i+1)+ " is : ");
        float p = sc.nextFloat();
        price.add(p);
    }
    }

    //Calculate the total price

    public void totalp() {
        float sum =0 ;
        for (int i=0 ; i<5 ; i++){
          sum +=price.get(i);
        }
        System.out.println("| ur total price is : "+sum);
    }

    //Calculate the average price

    public void averagePrice() {
        double total = 0;
        for (int i = 0; i < price.size(); i++) {
            total += price.get(i);
        }
        System.out.println("ur average price is : "+
                total / price.size());
    }

    // Find the highest and lowest price

    public void highestp(){
        System.out.println("the  highest price is : "
                +Collections.max(price));
    }

    public void lowestp(){
        System.out.println("the lowest price is : "
                +Collections.min(price));
    }

}
