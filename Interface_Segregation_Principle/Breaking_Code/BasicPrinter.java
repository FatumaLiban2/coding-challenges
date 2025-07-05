package Interface_Segregation_Principle.Breaking_Code;

class BasicPrinter implements Machine {
    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        // Not supported
        throw new UnsupportedOperationException("Cannot scan");
    }
}
