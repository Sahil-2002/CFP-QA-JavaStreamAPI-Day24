import java.util.Arrays;
import java.util.List;

public class Allmatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,6,8,10);
    boolean result=   numbers.stream().allMatch(n->{return n%2==0;});
        System.out.println(result);
      boolean res=  numbers.stream().anyMatch(n->{return n%2==0;});
        System.out.println(res);


    }
}
