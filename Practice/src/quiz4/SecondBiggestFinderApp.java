/**
 * SecondBiggestFinderApp.java
 * 
 * @author O. Kalu
 * @since 2021-02-27
 */
package quiz4;

import java.util.Arrays;
import java.util.Optional;

public class SecondBiggestFinderApp {

    public static void main(String[] args) {
        System.out.println("Hello SecondBiggestFinderApp");
        // Tests
        int[] a1 = null;
        int[] a2 = new int[]{};
        int[] a3 = new int[0];
        int[] a4 = new int[]{1,2,3,4,5};
        int[] a5 = new int[]{19,9,11,0,12};
        Optional<Integer> opt2ndBiggest = findSecondBiggest(a1);

        opt2ndBiggest.ifPresentOrElse(r -> System.out.printf("Second biggest of %s is: %s\n", Arrays.toString(a1), r),
             () -> System.out.println("Not found"));

//        System.out.printf("Second biggest of %s is: %d\n", Arrays.toString(a5), findSecondBiggest(a5));
//        System.out.printf("Second biggest of %s is: %d", Arrays.toString(a1), findSecondBiggest(a1));

    }

    private static Optional<Integer> findSecondBiggest(int[] a) {
        if(a == null || a.length < 2)
            //throw new IllegalArgumentException("Invalid input: " + a);
            return Optional.empty();
        int biggest = a[0] > a[1] ? a[0] : a[1];
        int secondBiggest = biggest == a[0] ? a[1] : a[0];
        for(int i=2; i < a.length; i++) {
            if(a[i] > biggest) {
                // new biggest
                secondBiggest = biggest;
                biggest = a[i]; 
            } else if (a[i] > secondBiggest) {
                // new secondBiggest
                secondBiggest = a[i];
            }
        }
        return Optional.of(secondBiggest);
        
        /*public Optional<Integer> secondBiggest(int[] a){
          if(a == null || a.length < 2) return Optional.empty();
          int biggest = a[0] > a[1] ? a[0] : a[1];
          int secondBiggest = biggest == a[0] ? a[1] : a[0];
          for (int i=2; i<a.length; i++){
          if (a[i] > biggest){
          secondBiggest = biggest;
          biggest = a[i];
          }
          else if(a[i] > secondBiggest){
          secondBiggest = a[i];
          }
          }
          return Optional.of(SeconBiggest);
          
          }*/
    }

}