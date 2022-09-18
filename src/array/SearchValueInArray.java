package array;

/**
 * In an unsorted array, the search operation can be performed by linear traversal from the first element to the last element.
 */
public class SearchValueInArray {

    public static void main(String arg[]) {

        int[] array = {
                1, 5, 8, 4, 8
        };
        int findValue = 8;
        findArrayValue(array, findValue);
    }

    static void findArrayValue(int array[], int findValue) {
        int arrayLength = array.length;
        System.out.println("Array Length:" + arrayLength);
        for (int i = 0; i < arrayLength; i++) {

            if (array[i] == findValue) {
                System.out.println("value  found:" + array[i]);
            } else {
                System.out.println("value found");
            }
        }
    }
}
