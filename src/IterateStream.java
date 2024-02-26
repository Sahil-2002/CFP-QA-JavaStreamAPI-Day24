import java.util.ArrayList;

public class IterateStream {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(17);
numbers.add(45);

numbers.stream().forEach(n-> System.out.println(n));

    }
}