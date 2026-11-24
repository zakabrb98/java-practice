import javax.swing.text.html.HTMLDocument;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
 HashSet hs1 = new HashSet();
     // HashSet hs1 = new HashSet(100);// initial capacity 100
    // HashSet hs1 = new HashSet(100 , 0.75);//initial capacity(100) and load factor(0.75)
    // HashSet <Integer> HS1 = new HashSet<Integer>(); // initial the data type
   /** hs1.add(111);
    hs1.add("shsjkhjkl");
    hs1.add(32.10);
    hs1.add(true);
    System.out.println(hs1);//insertion order not preserved
    //remove object
    hs1.remove(32.10);
    System.out.println("after remove element"+hs1);
    //get specific data
    System.out.println();
    //verify if the value exist
    System.out.println(hs1.contains(111));
    System.out.println(hs1.contains("AHMED"));
    //is empty or not
    System.out.println(hs1.isEmpty());
    System.out.println(!hs1.isEmpty());
    //read elements using for each loop
    for (Object e  : hs1){
        System.out.println(e);
    }
    // add all methode
    HashSet num = new HashSet();
    num.addAll(hs1);
    num.add("ali");
    System.out.println("add all from another HashSet : "+num);
    //remove all methode
    num.removeAll(hs1);
    System.out.println("remove all the data of another HashSet : "+num);**/
    //union
    HashSet num1 = new HashSet();
    num1.add(1);
    num1.add(2);
    num1.add(3);
    num1.add(4);
    num1.add(5);
    System.out.println(num1);
    HashSet num2 = new HashSet();
    num2.add(3);
    num2.add(4);
    num2.add(5);
    System.out.println(num2);
    num1.addAll(num2);// avoid duplicate
    System.out.println(num1);
    //intersection
    num1.retainAll(num2);//common elements
    System.out.println(num1);
    //difference
    num1.removeAll(num2);//remove all the difference
    System.out.println(num1);
}
