import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumAverage {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
     Optional<Integer>Sum = number.stream().reduce((val1, val2)->{return val1+val2;});
        System.out.println("Sum is "+Sum.get());
      int count = (int) number.stream().count();
      int average =  Sum.get()/count;
        System.out.println("Average is "+average);


    }
}
