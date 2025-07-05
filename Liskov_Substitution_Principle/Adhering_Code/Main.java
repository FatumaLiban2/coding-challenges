package Liskov_Substitution_Principle.Adhering_Code;
//Example of how
public class Main {
    public static void main(String[] args) {
        Bird myBird = new Sparrow(); // Treated as a Bird
        myBird.fly(); // Output: "Sparrow flying"
    }
}