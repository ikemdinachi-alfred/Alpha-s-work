import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class classWork {
        public static void main(String[] args) {
            // Example input arrays
            Integer[] input1 = {1, 2, 3, 5, 6, 7, 8, 9};
            Integer[] input2 = {1, 2, 8, 10, 13, 14, 10, 4};

            // Find common and lowest numbers
            List<Integer> commonNumbers = findCommonNumbers(input1, input2);
            List<Integer> lowestNumber = findLowestNumber(commonNumbers);

            // Print the results
            System.out.println("Output 1 (Common Numbers): " + commonNumbers);
            System.out.println("Output 2 (Lowest Number): " + lowestNumber);
        }

        private static List<Integer> findCommonNumbers(Integer[] arr1, Integer[] arr2) {
            Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
            Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));

            // Find common numbers using the intersection of sets
            set1.retainAll(set2);

            return new ArrayList<>(set1);
        }

        private static List<Integer> findLowestNumber(List<Integer> numbers) {
            // Find the lowest number in the list
            if (numbers.isEmpty()) {
                return new ArrayList<>();
            }

            int lowest = numbers.get(0);
            for (int num : numbers) {
                if (num < lowest) {
                    lowest = num;
                }
            }

            return Arrays.asList(lowest);
        }
    }


