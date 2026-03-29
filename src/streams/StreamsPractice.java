package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsPractice {

    /*
    1. Find Duplicate Elements
    Given a array of integers, find all the elements that appear more than once.
     */

    public Map<Integer, Long> getDuplicateInt(int[] array) {
        // {2, 1, 1, 2, 3, 4, 5}
        return Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    /*
    2. Find the first non-repeated character in a string using Streams.
     */

    public Character findFirstNonRepeatingChar(String str) {
        // "Vaishnav"
        return str.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().filter(entry -> entry.getValue() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (c1, c2) -> c1, LinkedHashMap::new))
                .firstEntry()
                .getKey();
    }

    /*
    3. Given a list of integers, find the second-highest number.
     */

    public Integer findSecondHighestNumber(List<Integer> integers) {
        return integers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
    }

    /*
    4. Count the frequency of each character in a string.
     */

    public Map<Character, Long> countFrequencyOfEachChar(String str) {
        return str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }

    /*
    5. Remove duplicate elements from a list.
     */

    public List<Integer> removeDuplicates(List<Integer> integers) {
        return integers.stream().distinct().toList();
    }

    /*
    6. Check if two strings are anagrams using Streams.
     */

    public Boolean checkForAnagram(String str1, String str2) {
        var collect1 = str1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        var collect2 = str2.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return collect1.equals(collect2);
    }


}
