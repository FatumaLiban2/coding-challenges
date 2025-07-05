package Interface_Segregation_Principle.Adhering_Code;

class AllInOnePrinter implements Printer, Scanner {
    public void print() {
        System.out.println("Printing from all-in-one...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }
}
