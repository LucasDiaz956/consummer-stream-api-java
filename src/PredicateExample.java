import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        Predicate<String> maisDeCincoLetras = palavra -> palavra.length() > 5;

        palavras.stream()
            .filter(maisDeCincoLetras)
            .forEach(System.out::println);
    }
}
