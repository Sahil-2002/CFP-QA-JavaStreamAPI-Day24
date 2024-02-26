import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       Optional<Integer>min =  numbers.stream().filter(n->n%2==0).min((val1, val2)->{return val1.compareTo(val2);});
        System.out.println(min.get());
Optional<Integer> max =numbers.stream().filter(n->n%2==0).max((val1, val2) ->{return val1.compareTo(val2);});
        System.out.println(max.get());

    }
}
