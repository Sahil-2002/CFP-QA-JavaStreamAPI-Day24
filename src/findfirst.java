import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class findfirst {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
     Optional<Integer> firts = numbers.stream().filter(n -> n % 2 == 0).findFirst();
        System.out.println(firts.get());


    }
}
