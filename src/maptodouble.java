import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class maptodouble {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
      List<Double> doubles =  number.stream().map(Integer::doubleValue).collect(Collectors.toList());

        System.out.println(doubles);
    }
}
