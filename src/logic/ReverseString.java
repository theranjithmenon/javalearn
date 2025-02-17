package logic;

public class ReverseString {

    public static void main(String[] args) {
        String text = "Hello World!";
        System.out.println(text);
        String reversedText = getReversedText(text);
        System.out.println(reversedText);


    }

    static String getReversedText(String text) {
        StringBuilder reversedText = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText.append(text.charAt(i));
        }

        return reversedText.toString();
    }
}
