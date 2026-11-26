import java.util.LinkedHashSet;

public class Ex2 {
    LinkedHashSet<String> lhs = new LinkedHashSet<String>();
    public void addnames(){
        lhs.add("ahmed");
        lhs.add("zakaria");
        lhs.add("malek");
        lhs.add("baha");
        lhs.add("ahmed");
        lhs.add("iyad");
    }
    public boolean check(String name){
        if (lhs.contains(name)) return true ;
        else return false ;
    }
    public void remove(String name ){
        if (!lhs.contains(name)) throw new RuntimeException("this name doesn't exist to delete ");
        else lhs.remove(name);
    }
    public LinkedHashSet<String> displayset(){
        return lhs ;
    }
}
