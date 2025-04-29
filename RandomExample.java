import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random rand = new Random();

        int randomNumber = rand.nextInt(10) + 1;  
        System.out.println("Random number: " + randomNumber);
    }
}