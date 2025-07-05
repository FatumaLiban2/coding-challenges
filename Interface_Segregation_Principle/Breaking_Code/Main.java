package Interface_Segregation_Principle.Breaking_Code;

public class Main {
    public static void main(String[] args) {
        Machine basic = new BasicPrinter();
        basic.print();
    }
}
