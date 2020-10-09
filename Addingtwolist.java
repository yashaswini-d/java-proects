package sortedorder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;


public class Addingtwolist {
	
	

	public static void main(String[] args) {
		
		ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "5", "f"));
        
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("2", "b", "1", "d", "e"));
         
        listOne.addAll(listTwo); 
         
        System.out.println(listOne);
		
        List<String> sortedList = listOne.stream().sorted().collect(Collectors.toList());

        sortedList.forEach(System.out::println);
				
		
	

	}

}
