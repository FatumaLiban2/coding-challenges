public class variable {
    void calculateUsage() {
        double liters;
        double days;

        liters = 150.0;
        System.out.println("Daily usage: " + liters + " liters");

        days = 3;
        liters = liters * days;
        System.out.println("Usage for 3 days: " + liters + " liters");

        days = 5;
        liters = (liters / 3) * days;
        System.out.println("Usage for 5 days: " + liters + " liters");
    }

    public static void main(String[] args) {
        (new variable()).calculateUsage();
    }
}

