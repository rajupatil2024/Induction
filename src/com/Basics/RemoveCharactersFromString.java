package com.Basics;

public class RemoveCharactersFromString {
	
	public static void main(String[] args) {
        String inputString = "sanatan dharm";
        String charactersToRemove = "a"; // Specify the characters you want to remove

        String result = removeCharacters(inputString, charactersToRemove);
        System.out.println("Original String: " + inputString);
        System.out.println("String after removing characters: " + result);
    }

    public static String removeCharacters(String input, String charactersToRemove) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (charactersToRemove.indexOf(c) == -1) {
                result.append(c);
            }
        }

        return result.toString();
    }
}

