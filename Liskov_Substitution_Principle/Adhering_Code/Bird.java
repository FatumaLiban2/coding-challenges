package Liskov_Substitution_Principle.Adhering_Code;

class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Sparrow extends Bird {
    public void fly() {
        System.out.println("Sparrow flying");
    }
}


