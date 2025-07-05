package Interface_Segregation_Principle.Adhering_Code;

public class Main {
    public static void main(String[] args) {
        Printer basic = new BasicPrinter();
        basic.print();

        AllInOnePrinter aio = new AllInOnePrinter();
        aio.print();
        aio.scan();
    }
}
