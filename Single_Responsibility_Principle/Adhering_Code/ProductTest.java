package Single_Responsibility_Principle.Adhering_Code;
public class ProductTest {
   public static void main(String[] args) {
        Product product = new Product("Book", 1899);
        ProductPrinter printer = new ProductPrinter();
        
        printer.printPriceInfo(product);
    } 
}
