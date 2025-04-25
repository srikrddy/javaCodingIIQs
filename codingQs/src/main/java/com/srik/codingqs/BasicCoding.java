package com.srik.codingqs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BasicCoding {


    public static void main(String[] args) {
        //1. reverseString
//        reverseString("ABCDEFGH");

        //2. swap 2 numbers
//        swapNumbers(21, 20);

        //3. countWords in a String
//        countWords("count count words in a a a a a a String");

        //4. isPrimeNubmer

//        isPrimeNubmer(23);

        //5. Second Highest Salary
//        secondHighest(new int[]{1, 2, 3, 4, 5, 6, 7});

        //6. Armstrong Number
//        System.out.println(armstrongNumber(151));

        //7.  RemoveWhiteSpaces
//        removeWhiteSpaces("aaaa bbb ccc");

        //8. twoSum
//        System.out.println(twoSum(new int[]{1,2,3,4,5,6,7}, 13));

        //9. findDisappearedNumbers
//        findDisappearedNumbers(new int[]{1,2,3,4,5,6,7});

        //sameOccurances or frequency of letters in a Sting.
//        sameOccurances("saasttqq");
    }

    static void reverseString(String input) {

        char chars[] = input.toCharArray();

        int first = 0, last = chars.length - 1;

        while (first < last) {

            char tmp = chars[first];

            chars[first] = chars[last];
            chars[last] = tmp;

            System.out.println("chars first: " + first + " = " + chars[first]);
            System.out.println("chars last: " + last + chars[last]);

            first++;
            last--;
        }
        System.out.println("chars: " + Arrays.toString(chars));
    }


    static void swapNumbers(int a, int b) {
        System.out.println("a: " + a + " b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + " b: " + b);
    }

    private static void countWords(String string) {
        String[] s = string.split(" ");
        System.out.println(Arrays.toString(s));
        Map<String, Integer> m = new HashMap();
        for (String word : s) {
            m.put(word, m.getOrDefault(word, 0) + 1); //if word does not exist 0 is returned instead of null;
        }
        System.out.println(m.entrySet());
        for (Map.Entry<String, Integer> entrySet : m.entrySet()) {
            System.out.println(entrySet.getKey() + " -> " + entrySet.getValue());
        }
    }

    private static boolean isPrimeNubmer(int num) {

        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i < num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }

    public static int secondHighest(int[] sals) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int s : sals) {

            if (s > first) {
                second = first;
                first = s;
            } else if (second < s && s < first) {
                second = s;
            }

        }
        System.out.println("second: " + second);
        return second;
    }

    public static boolean armstrongNumber(int num) {

        int original = num, sum = 0;
        int digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num = num / 10;
        }
        return original == sum;
    }

    public static void removeWhiteSpaces(String string) {

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                newString.append(string.charAt(i));
            }
        }
        System.out.println("newString:   " + newString);
    }

    //Q #13) Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        throw new RuntimeException("No such numbers found");
    }

    public static int[] findDisappearedNumbers(int[] nums) {

        //{1..x,x,..n} -> n
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
        }
        return null;
    }

    public static String contactStrings(String input) {
        String str[] = input.split(",");
        Arrays.sort(str);
        return String.join("", str);
    }

    static String sameOccurances(String str) {
        Map<Character, Integer> map = new HashMap();
        int count = 0;
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map.entrySet());

        for (int i : map.values()) {

        }
        Integer first = (Integer) map.values().toArray()[0];
        for (int i = 1; i < map.values().size(); i++) {
            System.out.println(first);
            System.out.println(map.values().toArray()[i]);

            System.out.println(first == map.values().toArray()[i]);
            if (first != map.values().toArray()[i]) {
                return "false";
            }
        }
        return "true";
    }


}
