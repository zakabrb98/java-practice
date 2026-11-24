import java.util.HashSet;
import java.util.Scanner;

public class CityHashset {
    Scanner sc = new Scanner(System.in);
    HashSet<String> city = new HashSet<String>();
  public void addcity(){
    /**  for (int i=0 ; i<5 ; i++){
          System.out.println("enter ur "+(i+1)+" city : ");
          String c = sc.nextLine();**/
    city.add("khenchla");
    city.add("alger");
    city.add("setif");
    city.add("khenchla");
    city.add("tanja");
  }
  public void print(){
      for (Object e : city){
          System.out.print(e+" --> ");
      }
      System.out.println(" null");
  }
  public int size(){
 return city.size();
  }
  public boolean verify(String c){
      if (city.contains(c))
          return true ;
      else return false ;

  }
  public void remove(String c){
      if (city.contains(c))
          city.remove(c);
      else System.out.println("this city doesn't exist ");
  }
  public boolean empty(){
      if (city.isEmpty()) return true ;
      else return false ;
  }
  }

