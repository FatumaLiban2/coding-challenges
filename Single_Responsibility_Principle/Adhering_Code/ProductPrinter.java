package Single_Responsibility_Principle.Adhering_Code;

//ProductPrinter is only responsible for displaying product data.

public class ProductPrinter {
    public void printPriceInfo(Product product) {
        System.out.println("Product: " + product.getName());
        System.out.println("Price: Ksh. " + product.getPrice());
    }
}
