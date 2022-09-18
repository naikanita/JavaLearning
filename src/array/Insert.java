package array;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 1.Insert at the end
 * 2. Insert at any position
 */
public class Insert {

    public static void main(String[] args) {
        int[] array = {
                2, 3, 4, 5, 6, 7, 0
        };

        int arrayLength = array.length;
        int valueToBeInserted = 20;
        int pos = 5;

        System.out.print("Array Lengh:" + arrayLength);

        System.out.print("\nBefore Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        insertAtEnd(array, arrayLength, valueToBeInserted);
        array = insertAtAnyPosition(array, arrayLength, valueToBeInserted, pos);

        // print the updated array
        System.out.println("\nArray with " + pos
                + " inserted at position "
                + pos + ":\n"
                + Arrays.toString(array));

    }

    /**
     * Insert at the end
     *
     * @param array       : array object
     * @param length:     total length
     * @param insertValue : value to be inserted
     */
    static void insertAtEnd(int[] array, int length, int insertValue) {
        System.out.print("\nAfter inserting at the end:");

        for (int i = 0; i < length; i++) {
            array[length - 1] = insertValue;
            System.out.print(array[i] + " ");
        }
    }

    /**
     * Java Program to Insert an element
     * at a specific position in an Array
     * @param array
     * @param length
     * @param insertValue
     * @param pos
     * @return
     */
    static int[] insertAtAnyPosition(int[] array, int length, int insertValue, int pos) {

        // create new array with +1 size of older array
        int[] newArray = new int[length + 1];
        for (int i = 0; i < length; i++) {
            if (i < pos - 1) {
                newArray[i] = array[i];
            } else if (i == pos - 1) {
                newArray[i] = insertValue;
            } else {
                newArray[i] = array[i - 1];
            }

        }
        return newArray;
    }
}
