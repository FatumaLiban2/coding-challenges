//Single Responsibility Principle (SRP)
//Code snippet violating this principle.

/* 
    Why this violates Single Responsibility Principle:
    The object Product is responsible for both holding product data and displaying information.
    It has two reasons to change: if product data changes or display logic changes.
*/
package Single_Responsibility_Principle.Breaking_Code;
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayPriceInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price: Ksh. " + price);
    }

    
}

