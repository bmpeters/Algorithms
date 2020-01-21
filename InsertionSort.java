import java.util.List;

// Insertion Sort Example

public class InsertionSort {

   // main()
   public static void main(String[] args) {
      int[] array = new int[10];
      int unsortedIndex;

      for (unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++) {
         int temp = array[unsortedIndex];
         int i;

         for (i = unsortedIndex; i > 0 && array[i - 1] > temp; i--) {
            array[i] = array[i - 1];
         }

         array[i] = temp;
      }
   }
}
