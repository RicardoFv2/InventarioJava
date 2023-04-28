package inventory;

public class Main {

    public static void main(String[] args) {
        
        Product pr1 = new Product(10,"Arroz", 25, 5.00);
        Product pr2 = new Product(10, "Frijol", 25, 6.99);
        
        System.out.println(pr1 + "" + pr2);
    }
    
}
