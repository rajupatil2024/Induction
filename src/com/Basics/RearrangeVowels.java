package com.Basics;


public class RearrangeVowels {

	public static void main(String[] args) {

		String inputString = "Hello, World!";
        String outputString = replaceVowelsWithNextVowel(inputString);
        System.out.println(outputString);
    }

    public static String replaceVowelsWithNextVowel(String inputString) {
        char[] inputChars = inputString.toCharArray();
        StringBuilder result = new StringBuilder();

        for (char ch : inputChars) {
            if (isVowel(ch)) {
                result.append(getNextVowel(ch));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static char getNextVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'u') {
            return 'a';
        } else {
            return (char) (ch + 1);
        }
	}

}
