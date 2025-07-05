package Liskov_Substitution_Principle.Breaking_Code;

public class Main {
        public static void main(String[] args) {
        Bird myBird = new Ostrich(); // Still treated as a Bird
        myBird.fly(); // Throws exception! "Ostrich can't fly"
        
    }
}
