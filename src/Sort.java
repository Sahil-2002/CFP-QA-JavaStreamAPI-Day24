import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(15,665,12,788,65,122,10,6,45);
    List<Integer>Sorted = number.stream().sorted().collect(Collectors.toList());
        System.out.println(Sorted);
    }
}
