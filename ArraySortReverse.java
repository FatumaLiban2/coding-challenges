//SORT and REVERSE elements in a string array
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverse {
    public static void main(String[] args){
        // Initial array of pallet IDs
        String[] pallets = {"B16", "A11", "B12", "A19","C17"};

        //Sort the array in ascending order
        System.out.println("Sorted ...");
        Arrays.sort(pallets);       //Sorts the array alphabetically
        for (String pallet : pallets) {
            System.out.println("--"+pallet);
        }

        //Reverse the sorted array
        System.out.println("\nReversed ...");
        List<String> palletList = Arrays.asList(pallets);    //converting array into a list 
        Collections.reverse(palletList);   //Reverses the order ; Collections.reverse()-(works on lists, not arrays)
        for (String pallet : palletList) {
            System.out.println("--"+pallet);
        }
    }
}

/* 
 Arrays.sort(pallets)
    -Sorts the array alphabetically (lexicographically).

    Collections.reverse(...)
    -Reverses the order of the sorted list.
    - which works on lists, not arrays.

    Arrays.asList(...)
    -Converts the array into a list so that it can be reversed using Collections.reverse.
*/