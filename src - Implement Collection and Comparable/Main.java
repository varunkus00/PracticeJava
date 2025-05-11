import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item("Apple", 40));
        items.add(new Item("Banana", 30));
        items.add(new Item("Orange", 20));
        items.add(new Item("Grape", 10));
        items.add(new Item("Pineapple", 10));

        Collections.sort(items);
        System.out.println(items);

        Collections.sort(items, (a, b) -> {
            return a.getItemName().compareTo(b.getItemName());
        });
        System.out.println(items);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println(numbers.stream().map(x -> x*x).collect(Collectors.toList()));
        System.out.println(numbers.stream()
                .filter(x->x%2 == 0)
                .map(x->x*x)
                .mapToInt(Integer::intValue)
                .sum());
        System.out.println(numbers.stream()
                .max(Integer::compareTo)
                .orElse(0));
        System.out.println(numbers.stream()
                .distinct()
                .collect(Collectors.toList()));
        System.out.println(numbers.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .average().orElse(0));

        List<String> names = Arrays.asList("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        System.out.println(names.stream().map(String::length).collect(Collectors.toList()));
        System.out.println( names.stream()
                .filter(x->!x.startsWith("T"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList()));
        System.out.println(names.stream().filter(x->x.length() > 10).findFirst().get());
    }
}