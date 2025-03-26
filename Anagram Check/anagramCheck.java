import java.util.Arrays;
import java.util.HashMap;

public class anagramCheck {

    public static boolean isAnagram_1(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isAnagram_2(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
            map.put(str2.charAt(i), map.getOrDefault(str2.charAt(i), 0) - 1);
        }

        for (int i : map.values()) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "iltsen";
        String str2 = "Silent";
        System.out.println(isAnagram_1(str1.toLowerCase(), str2.toLowerCase()));
        System.out.println(isAnagram_2(str1.toLowerCase(), str2.toLowerCase()));
    }
}