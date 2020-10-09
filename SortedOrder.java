package sortedorder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedOrder {

    public static void main(String[] args) {

    	List<String> list = Arrays.asList("9", "A", "Z", "1", "5", "Y", "4", "a", "9");

        
		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());

        sortedList.forEach(System.out::println);
    }
}
