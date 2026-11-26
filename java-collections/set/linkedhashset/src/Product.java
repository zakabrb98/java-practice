import java.util.LinkedHashSet;

public class Product {
    private String name ;
    private int id ;
    private LinkedHashSet sizes = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public LinkedHashSet getSizes() {
        return sizes;
    }

    public Product(String name ,int id) {
        this.name = name;
        this.id = id;
        this.sizes = sizes;
    }

    public void addsize(String s){
        sizes.add(s);
    }
    public String toString(){
        return " name of product is : "+this.name+" | id of product is : "+this.id+" | the size of this product is : "+sizes;
    }
}
