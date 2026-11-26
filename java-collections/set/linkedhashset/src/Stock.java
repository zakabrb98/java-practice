import java.util.HashSet;
import java.util.LinkedHashSet;

public class Stock {
private LinkedHashSet<Product> products =new LinkedHashSet<>();

    public LinkedHashSet<Product> getProducts() {
        return products;
    }

    public Stock() {
        this.products = products;
    }
    public void addproduct(Product p ){
        if (products.contains(p)) throw new RuntimeException("this producet is already exist ");
        else products.add(p);
    }
    public void removeproduct(Product p ){
        if (!products.contains(p)) throw new RuntimeException("the product doesn't exist");
        else products.remove(p);
    }
    public boolean searchproduct( Product p ){
        if (!products.contains(p)) throw new RuntimeException("this product doesn't exist ");
        else return true ;
    }
}
