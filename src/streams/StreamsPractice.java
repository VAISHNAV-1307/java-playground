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

    /*
    7. Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
     */

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    /*
    8. Longest Substring Without Repeating Characters
    Input: "abcabcbb"
    Output: 3
    Explanation:
    Longest substring = "abc"
     */

    public String getLongestSubString(String str) {
        String longest = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String substring = str.substring(i, j + 1);
                if (hasAllUnique(substring) && substring.length() > longest.length()) {
                    longest = substring;
                }
            }
        }
        return longest;
    }

    private boolean hasAllUnique(String s) {
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!seen.add(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * First Non-Repeating Character
     * Input: "aabbccddef"
     * Output: 'e'
     */

    public Character getFirstNonRepeatingChar(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(null);
    }


}
