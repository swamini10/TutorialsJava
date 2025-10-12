public class Demo {

    public static boolean onlyOddNumbers(int... numbers) {
        for (int i : numbers) {
            if (i % 2 == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = onlyOddNumbers(1,3,5,7,9);
        System.out.println("Only odd numbers? " + result);
    }
}

// using Array list
/*
import java.util.Arrays;
import java.util.List;
public class Demo {

    public static boolean onlyOddNumbers(List<Integer> list) {
        for (int i : list) {
            if (i % 2 == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,5,7,9);
        boolean result = onlyOddNumbers(numbers);
        System.out.println("Only odd numbers? " + result);
    }
}
*/
