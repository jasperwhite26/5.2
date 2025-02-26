import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        var numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        var oddNumbers = numbers.stream()
                .filter(number -> number % 2 !=0 )
                .toList();

        System.out.print("Odd numbers: " + oddNumbers);

    }
}
