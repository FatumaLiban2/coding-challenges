//Declaring an array and filtering the elements
public class ArrayChallenge {
    public static void main(String[] args) {
        //Declares an array of strings called orderIds.
        String[] orderIds = {"B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179"};
        /*This is a for-each loop that goes through each element in the orderIds array.
         The startsWith() method returns true if the string begins with the specified prefix.
        */
        for (String item : orderIds) {
            if (item.startsWith("B")) {
                System.out.println(item);
            }
        }
    }
}
