package logic;

public class CheckPalindrome {
    public static void main(String[] args) {
        String text = "Malayalam";
        System.out.println(text);

        String reversedText = getReversedText(text.toLowerCase());
        if (reversedText.equals(text)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        System.out.println(reversedText);
    }

    static String getReversedText(String text) {
        return ReverseString.getReversedText(text);
    }
}
