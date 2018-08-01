package problem1;

/*
 * In this code, I am trying to read a file which I put in the classpath, I'd have specify the path as well, 
 * it's  not necessary to put the file in classpath.
 * I used Java 8 API to shorten the code to read the file in one line 31;
 * After reading the file, I replaced all special characters then I split it into array of strings by using space.
 * I used Map interface to save each string in the list with its number of occurrence. 
 * Finally I used custom comparable to be able to sort the list.
 * Then I print out the result.
 * 
 * @author Ferdis,
 * */
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FileReading {

	public static void main(String[] str) throws IOException {
		// printing the header of the list
		System.out.println("WORD		COUNT");
		System.out.println("*********************");
		
		//special characters in file
		String delimiter = "[,.\"]";
		
		//reading the file line by line and join the lines at the end
		String paragraph = Files.lines(Paths.get("Paragraph.txt")).collect(Collectors.joining(" "));
		//String s = paragraph.sub
		// creating an array from the result string from file reading.
		String[] arrayString = paragraph.replaceAll(delimiter, "").split(" ");

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < arrayString.length; i++) {
			
			//this eliminate white space between lines
			if (arrayString[i].isEmpty())
				continue;
			//changing strings to lower case,
			if (map.containsKey(arrayString[i].toLowerCase())) {
				int newCount = map.get(arrayString[i].toLowerCase()) + 1;
				map.put(arrayString[i].toLowerCase(), newCount);
			} else {
				map.put(arrayString[i].toLowerCase(), 1);
			}
		}

		//Using custom comparable "Pair"
		List<Pair> list = new ArrayList<>();
		for (String x : map.keySet()) {
			Pair c = new Pair(x, map.get(x));
			list.add(c);
		}
		
		//sorting & printing results
		Collections.sort(list);
		list.forEach(System.out::println);
		

	}
}