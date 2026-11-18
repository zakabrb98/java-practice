import java.time.LocalDate ;
public class Generics<T> {
    //declare atributes with open type
    private T id ;
    private T number ;
    private T age ;
    //get methode for get this year
    int thisyear = LocalDate.now().getYear();

    public T getId() {
        return id;
    }

    public T getNumber() {
        return number;
    }

    public T getAge() {
        return age;
    }

    public Generics(T id, T number, T age) {
        this.id = id;
        this.number = number;
        this.age = age;
    }
    //get the information with any type and give it to this methode
  public  void info(){
      System.out.println(" ur id : "+getId()+"| ur number : "+getNumber()+"| ur age is : "+getAge());
  }
}
