package task1;

import java.util.Arrays;

public class Main {
    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }
 
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 2, 1, 2, 4, 5};
 
        int[] distinct = removeDuplicates(arr);
        System.out.println(Arrays.toString(distinct));
    }
}
