import java.util.*;

public class AutoboxingSum {
  
 
    public static List<Integer> parseStringToIntegers(List<String> stringNumbers) {
        List<Integer> integers = new ArrayList<>();
        for (String num : stringNumbers) {
            try {
                integers.add(Integer.parseInt(num)); // Autoboxing
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + num);
            }
        }
        return integers;
    }
    
    
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing
        }
        return sum;
    }

    public static void main(String[] args) {
        List<String> stringNumbers = Arrays.asList("10", "20", "30", "40", "50");
        List<Integer> integers = parseStringToIntegers(stringNumbers);
        
        int sum = calculateSum(integers);
        System.out.println("Sum of numbers: " + sum);
    }
}
