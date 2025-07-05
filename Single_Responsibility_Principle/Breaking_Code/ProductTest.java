package Single_Responsibility_Principle.Breaking_Code;
public class ProductTest {
        public static void main(String[] args) {
            Product product1 = new Product("Pen", 150);
            Product product2 = new Product("Notebook", 400);

            System.out.println("Testing SRP-violating BadProduct class:");
            product1.displayPriceInfo();
            System.out.println("---");
            product2.displayPriceInfo();
        }
    }