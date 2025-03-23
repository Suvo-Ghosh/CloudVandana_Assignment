import java.util.Arrays;

public class anagramCheck {

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "iltsen";
        String str2 = "Silent";
        System.out.println(isAnagram(str1.toLowerCase(), str2.toLowerCase()));
    }
}