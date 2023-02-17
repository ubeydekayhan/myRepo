public class Palindrome {
    public static void main(String[] args) {

        isPalindrome("hazan");


    }

    public static String isPalindrome(String str) {

        String k = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            k = k + str.charAt(i);
        }
        if (k.equalsIgnoreCase(str)) {
            System.out.println("It is Palindrome");
        } else System.out.println("No Palindrome");
        return str;
    }
}
